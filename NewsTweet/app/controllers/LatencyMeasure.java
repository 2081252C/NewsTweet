package controllers;
 
import java.util.Arrays;
 
public class LatencyMeasure {
 
    private long[] times;
    private long time;
    private int index=0;
 
    public LatencyMeasure(int maxCapacity) {
        times = new long[maxCapacity];
 
        for (int i = 0; i < times.length; i++) {
            times[i] = -1;
        }
    }
 
    public void startMeasure(){
        time = System.nanoTime();
    }
 
    public void endMeasure() {
        times[index++] = System.nanoTime()-time;
    }
 
    public void printStats() {
        int filled = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] == -1) {
                filled = i;
                break;
            }
        }
 
        long[] popTimes = new long[filled];
        System.arraycopy(times, 0, popTimes, 0, filled);
 
        Arrays.sort(popTimes);
        System.out.printf("Latency measured: \n" +
                        " %.2f us for 50 percentile\n" +
                        " %.2f us for 90 percentile\n" +
                        " %.2f us for 99 percentile\n" +
                        " %.2f us for 99.9 percentile\n" +
                        " %.2f us for 99.99 percentile\n" +
                        " %.2f us worst percentile\n",
                popTimes[popTimes.length / 2] / 1e3,
                popTimes[popTimes.length * 9 / 10] / 1e3,
                popTimes[popTimes.length - popTimes.length / 100] / 1e3,
                popTimes[popTimes.length - popTimes.length / 1000] / 1e3,
                popTimes[popTimes.length - popTimes.length / 10000] / 1e3,
                popTimes[popTimes.length - 1] / 1e3
        );
    }
}
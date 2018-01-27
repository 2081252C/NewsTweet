package controllers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoadingFrame extends JFrame{

JButton button;
public LoadingFrame() {
    // button = new JButton("Completed");
    // button.addActionListener(new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         System.out.println("Application entered");
    //     }
    // });
    // setLayout(new BorderLayout());
    // add(button, BorderLayout.CENTER);
}


public void startLoading(){
    final Component glassPane = getGlassPane();
    final JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    final JLabel label = new JLabel();
    panel.add(label, BorderLayout.SOUTH);
    setGlassPane(panel);
    panel.setBackground(Color.WHITE);
    panel.setVisible(true);
    panel.setOpaque(true);
    //button.setEnabled(false);
    ImageIcon imageIcon = new ImageIcon("/home/carly/Documents/Project/NewsTweet/NewsTweet/app/controllers/ajax-loader.gif");
    JLabel iconLabel = new JLabel();
    iconLabel.setIcon(imageIcon);
    imageIcon.setImageObserver(iconLabel);
    label.setHorizontalAlignment(JLabel.CENTER);
    iconLabel.setHorizontalAlignment(JLabel.CENTER);
    panel.add(iconLabel);

    Thread thread = new Thread(){
        @Override
        public void run() {
            for (int i = 5; i > 0; i--) {
                label.setText("Loading ... " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                            // loading finished
            glassPane.setVisible(true);
            //button.setEnabled(true);
        }
    };
    thread.start();
}

}
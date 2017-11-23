package controllers;

import play.data.validation.Constraints;

public class SearchData {

    @Constraints.Required
    private String searchTerm;

    public SearchData() {
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

}
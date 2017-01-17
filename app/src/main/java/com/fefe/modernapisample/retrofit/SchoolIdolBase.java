package com.fefe.modernapisample.retrofit;

import java.util.List;

/**
 * Created by fefe on 2017/01/17.
 */

public class SchoolIdolBase {
    private String next;
    private String previous;
    private List<SchoolIdol> results;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<SchoolIdol> getResults() {
        return results;
    }

    public void setResults(List<SchoolIdol> results) {
        this.results = results;
    }
}

package com.guy.class23b_andb_4;

public class Second extends Property {

    protected String status = "";
    protected int year = 0;

    public Second() {
        super();
    }

    public String getStatus() {
        return status;
    }

    public Second setStatus(String status) {
        this.status = status;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Second setYear(int year) {
        this.year = year;
        return this;
    }
}

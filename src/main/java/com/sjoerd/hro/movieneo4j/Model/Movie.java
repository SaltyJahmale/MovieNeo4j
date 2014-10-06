/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjoerd.hro.movieneo4j.Model;

/**
 *
 * @author Sjoerd Thijsse
 */
public class Movie {

    private String name;
    private String date;
    private int year;

    public Movie(String name, String date, int year) {
        this.name = name;
        this.date = date;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", date=" + date + ", year=" + year + '}';
    }

}

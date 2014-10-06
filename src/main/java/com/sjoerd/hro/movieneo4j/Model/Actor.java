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
public class Actor {

    private String name;
    private String birthDay;

    public Actor(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", birthDay=" + birthDay + '}';
    }

}

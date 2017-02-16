package com.company;


/**
 * Created by boun on 11/29/16.
 */
public class Country {
    String name;
    String abbrevation;

    public Country(String name, String abbrevation) {
        this.name = name;
        this.abbrevation = abbrevation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public void setAbbrevation(String abbrevation) {
        this.abbrevation = abbrevation;
    }

}

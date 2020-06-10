package com.wzy.structural.filter;

/**
 * description: Person <br>
 * date: 2020-06-10 09:41 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;


    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}

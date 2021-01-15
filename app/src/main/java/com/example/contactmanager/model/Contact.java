package com.example.contactmanager.model;

import java.lang.reflect.Constructor;

public class Contact {
    private int id;
    private String name;
    private String phoneNumber;


    public Contact(){

    }

    public Contact (int id, String name, String phoneNumber){

        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId(){
        return id;
    }
}

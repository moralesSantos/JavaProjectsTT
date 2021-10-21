package com.tts.restdemo.service;

import java.util.Date;

public class SimpleServiceImpl implements  SimpleService{

    private Date dt = new Date();
    private int year = dt.getYear() + 1900;

    @Override
    public boolean isInFuture(int yearOfBirth) {
        return yearOfBirth > year;
    }

    @Override
    public int calculateAge(int yearOfBirth) {
        return year - yearOfBirth;
    }
}

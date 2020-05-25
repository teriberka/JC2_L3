package ru.geekbrains.LC2.L3.hometask;

import java.util.ArrayList;


public class Person {
    private ArrayList<String> eMail;
    private ArrayList<String> telNumber;

    public Person(ArrayList<String> eMail, ArrayList<String> telNumber) {
        this.eMail = eMail;
        this.telNumber = telNumber;
    }

    public void getEmail() {
        System.out.println(eMail);
    }

    public void getTelNumber() {
        System.out.println(telNumber);
    }

}

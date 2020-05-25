package ru.geekbrains.LC2.L3.hometask;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    public HashMap<String, Person> myPhoneBook = new HashMap<>();

    public void getMail(String s){
        ArrayList<String> tel = new ArrayList<String>();
        ArrayList<String> mail = new ArrayList<String>();
        Person someperson = new Person(tel,mail);
        someperson = myPhoneBook.get(s);
        someperson.getEmail();
    }

    public void getNumber(String s){
        ArrayList<String> tel = new ArrayList<String>();
        ArrayList<String> mail = new ArrayList<String>();
        Person someperson = new Person(tel,mail);
        someperson = myPhoneBook.get(s);
        someperson.getTelNumber();
    }

    public void addInfo(String lastname, Person person) {
        myPhoneBook.put(lastname, person);
    }
}

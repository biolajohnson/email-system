package com.bankApplications.reduxBank;

import java.util.Random;

public class Person{
    String[] namesList;
    String firstname;
    String lastname;
    int SSN;
    String address;

    public String[] splitNames(String names) {
        this.namesList = names.split(" ");
        this.firstname = namesList[0];
        this.lastname = namesList[1];
        generateSSN();
        return namesList;

    }

    private void generateSSN(){
        Random random = new Random();
        int upperLimit = 100000000;
        this.SSN = random.nextInt(upperLimit);
    }

    public Person(){}
    public Person(String names){
        splitNames(names);
        generateSSN();
    }
}

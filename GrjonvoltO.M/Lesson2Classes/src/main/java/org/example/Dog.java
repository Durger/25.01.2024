package org.example;

import java.util.Scanner;

public class Dog{

    private String name;
    private int numberOfLegs;
    private int numbersOfTails;
    public Dog (String name, int numberOfLegs, int numbersOfTails) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.numbersOfTails = numbersOfTails;
    }

    public Dog () {

    }

    public void getData () {
        System.out.println("Имя - " +  name + " Количство ног - " + numberOfLegs + " Количство хвостов - " + numbersOfTails);
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

}

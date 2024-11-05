/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 * Generic Student class
 * Takes in credits, and inherits name and age from Human.java
 */
public class Student extends Human{
    private int credits;

    public Student(String name, short age, int credits){
        super(name, age);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String getAddress() {
        return "";
    }

    @Override
    public void setAddress(String address) {
        getAddress();
    }
}

/**
 * Senior Class
 * Similar to student class, but requires the student to have no less than 85 credits.
 * If this requirement is not met, and exception is thrown.
 */
class Senior extends Student {
    private int credits;
    public Senior(String name, short age, int credits) {
        super(name, age,credits);
        if(credits < 85) {
            throw new IllegalArgumentException("Senior status credits must be at least 85");
        }
    }
    @Override
    public String toString() {
        return "Senior{" + " Name= " + getName() + " Age=" + getAge() + " Credits=" + getCredits() + '}';
    }
}

/**
 * Freshman Class
 * Extends student, and is functionally similar to student other than the freshman label.
 */
class Freshman extends Student {
    private int credits;
    public Freshman(String name, short age, int credits) {
        super(name, age,credits);

    }
    @Override
    public String toString() {
        return "Freshman{" + " Name= " + getName() + " Age=" + getAge() + " Credits=" + getCredits() + '}';
    }
}

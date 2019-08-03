package com.stackroute.example.oops;
//extending the inheritance class with human
public class Human extends Inheritance{
    //creating the instance variable
    private String name;
    //generating parameterized constructor for human subclass
    public Human(boolean veg, String eatsThis, int legs, String name) {
        super(veg, eatsThis, legs);
        this.name = name;
    }
    //generating getter method
    public String getName() {
        return name;
    }
    //generating setter method
    public void setName(String name) {
        this.name = name;
    }
}

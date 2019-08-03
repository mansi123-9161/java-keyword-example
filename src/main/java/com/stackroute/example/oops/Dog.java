package com.stackroute.example.oops;
    //extending the inheritance class with dog
public class Dog extends Inheritance {
    private String color;
    //generating parameterized constructor for human subclass
    public Dog(boolean veg, String eatsThis, int legs, String color) {
        super(veg, eatsThis, legs);
        this.color = color;
    }
        //generating getter method
    public String getColor() {
        return color;
    }
        //generating setter method
    public void setColor(String color) {
        this.color = color;
    }
}

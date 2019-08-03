//package defined for oops concept
package com.stackroute.example.oops;
//base class
public class Inheritance {
    //base class has 3 fields
   private boolean veg;
   private String eatsThis;
   private int legs;
   // base class having 1 parameterized constructor

    public Inheritance(boolean veg, String eatsThis, int legs) {
        this.veg = veg;
        this.eatsThis = eatsThis;
        this.legs = legs;
    }
    //generating getter method
    public String getEatsThis() {
        return eatsThis;
    }
    //generating setter method
    public void setEatsThis(String eatsThis) {
        this.eatsThis = eatsThis;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Boolean isVeg(){
        return veg;
    }
}

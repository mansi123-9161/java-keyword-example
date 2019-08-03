package com.stackroute.example.oops;
//main class for animal inheritance example
public class Animal {
    public static void main(String[] args) {
        //object created for dog subclass
        Dog dog=new Dog(false,"meat",4,"brown");
        //printing the result of dog subclass
        System.out.println("is dog veg"+dog.isVeg());
        System.out.println("dogs eat"+dog.getEatsThis());
        System.out.println("dog is of"+dog.getColor()+"color");
        System.out.println("dog has "+dog.getLegs()+"legs");
        //object created for human subclass
        Human human=new Human(true,"food",2,"jay");
        //printing the result of human subclass
        System.out.println("is human veg"+human.isVeg());
        System.out.println("human eat"+human.getEatsThis());
        System.out.println("human has"+human.getLegs()+ "legs");
        System.out.println("human's name is "+human.getName());
    }
}

package com.stackroute.example.oops.polymorphism;

import java.util.Arrays;
import java.util.List;

public  class MainClassCake{
    public static void main(String[] args) {
     CakeCrater cakeCrater=new CakeCrater(Arrays.asList(new BlackForest(),new VanilaCake(),new ChocolateCake()));
     cakeCrater.createCake();
    }
}

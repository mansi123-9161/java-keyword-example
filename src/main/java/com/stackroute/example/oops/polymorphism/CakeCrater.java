package com.stackroute.example.oops.polymorphism;

import java.util.List;

public class CakeCrater {
    private List<CakeIngredient> cakeIngredients;

    public CakeCrater(List<CakeIngredient> cakeIngredients) {
        this.cakeIngredients = cakeIngredients;
    }
    public void createCake(){
        cakeIngredients.forEach(cake->cake.produceCake());
    }
}

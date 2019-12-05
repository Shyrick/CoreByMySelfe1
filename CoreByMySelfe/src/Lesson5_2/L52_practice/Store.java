package Lesson5_2.L52_practice;

import Lesson5_2.L52_practice.Products.Product;
import Lesson5_2.L52_practice.Products.Smartfone;
import Lesson5_2.L52_practice.Products.Vegetable;
import Lesson5_2.L52_practice.Products.Water;

public class Store {

    public double money;
    Smartfone[] smartfones;
    Vegetable[] vegetables;
    Water[] waters;
    String [] products;

    public Store(double money, Smartfone[] smartfones, Vegetable[] vegetables, Water[] waters) {
        this.money = money;
        this.smartfones = smartfones;
        this.vegetables = vegetables;
        this.waters = waters;
        this.products = new String[]{"Smartfone", "Vegetables", "Water" };
    }

    public void addSmartfoneToArray (Smartfone newSmartfone){
        Smartfone [] array = new Smartfone[smartfones.length + 1];
        for (int i = 0; i < smartfones.length ; i++) {
            array [i] = smartfones [i];
        }
        array[array.length-1] = newSmartfone;
    }

    public void addVegetableToArray (Vegetable newVegetable){
        Vegetable [] array = new Vegetable[vegetables.length + 1];
        for (int i = 0; i < vegetables.length ; i++) {
            array [i] = vegetables [i];
        }
        array[array.length-1] = newVegetable;
    }

    public void addWaterToArray (Water newWater){
        Water [] array = new Water[waters.length + 1];
        for (int i = 0; i < waters.length ; i++) {
            array [i] = waters [i];
        }
        array[array.length-1] = newWater;
    }




    public Product [] findCategoryArray(String category){
        if (category == "Smartfone" ) {
            return smartfones;
        } else if (category == "Vegetables") {
            return vegetables;
        } else return waters;

    }
}

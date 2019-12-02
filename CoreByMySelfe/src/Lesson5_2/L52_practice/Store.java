package Lesson5_2.L52_practice;

import Lesson5_2.L52_practice.Products.Smartfone;
import Lesson5_2.L52_practice.Products.Vegetable;
import Lesson5_2.L52_practice.Products.Water;

public class Store {
    public double money;
    Smartfone[] smartfones;
    Vegetable[] vegetables;
    Water[] waters;

    public Store(double money, Smartfone[] smartfones, Vegetable[] vegetables, Water[] waters) {
        this.money = money;
        this.smartfones = smartfones;
        this.vegetables = vegetables;
        this.waters = waters;
    }

    public void findProduct(){

    }
}

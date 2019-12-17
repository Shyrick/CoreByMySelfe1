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
    Product curentProduct;

    public Store(double money, Smartfone[] smartfones, Vegetable[] vegetables, Water[] waters) {
        this.money = money;
        this.smartfones = smartfones;
        this.vegetables = vegetables;
        this.waters = waters;
        this.products = new String[]{"Smartfone", "Vegetables", "Water" };
        this.curentProduct = null;
    }

    public Product getCurentProduct() {
        return curentProduct;
    }

    public void addSmartfoneToArray (Smartfone newSmartfone){
        Smartfone [] newArray = new Smartfone[smartfones.length + 1];
        for (int i = 0; i < smartfones.length ; i++) {
            newArray [i] = smartfones [i];
        }
        newArray[newArray.length-1] = newSmartfone;
        smartfones = newArray;
    }

    public void addVegetableToArray (Vegetable newVegetable){
        Vegetable [] newArray = new Vegetable[vegetables.length + 1];
        for (int i = 0; i < vegetables.length ; i++) {
            newArray [i] = vegetables [i];
        }
        newArray[newArray.length-1] = newVegetable;
        vegetables = newArray;
    }

    public void addWaterToArray (Water newWater){
        Water [] newArray = new Water[waters.length + 1];
        for (int i = 0; i < waters.length ; i++) {
            newArray [i] = waters [i];
        }
        newArray[newArray.length-1] = newWater;
        waters = newArray;
    }

    public Product findProductById (int id, Product [] products){

        for (int i = 0; i < products.length; i++) {
            if (products [i].getId() == id){
                return products[i];
            }
        }return products [0];
    }

    public void byCurrentProduct (Product [] products, Product product){


    }

    public void deleteProductFromArray (Product [] products, Product product){


    }

    public Product [] findCategoryArray(String category){
        if (category == "Smartfone" ) {
            return smartfones;
        } else if (category == "Vegetables") {
            return vegetables;
        } else return waters;

    }

    public void showCategoryArray (Product [] array){
        for (int i = 0; i < array.length; i++) {
            array[i].show(); //вместо вывода в консоль сделать вывод в окно
        }
    }

}

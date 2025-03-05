package main.java.com.moroz.fabric;

import main.java.com.moroz.fabric.creator.CreateCheese;
import main.java.com.moroz.fabric.creator.CreateVine;
import main.java.com.moroz.fabric.creator.Creator;
import main.java.com.moroz.fabric.product.Cheese;
import main.java.com.moroz.fabric.product.Vine;

public class FactoryMethod {

    public static void main(String[] args) {
        Creator creatorvine = new CreateVine();
        creatorvine.someOperation();
        Vine vine = (Vine) creatorvine.createProduct();


        Creator creatorcheese = new CreateCheese();
        creatorcheese.someOperation();
        Cheese cheese = (Cheese) creatorcheese.createProduct();
    }
}

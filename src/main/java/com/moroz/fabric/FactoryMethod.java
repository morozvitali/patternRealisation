package main.java.com.moroz.fabric;

import main.java.com.moroz.fabric.creator.CreateCheese;
import main.java.com.moroz.fabric.creator.CreateVine;
import main.java.com.moroz.fabric.creator.Creator;

public class FactoryMethod {

    public static void main(String[] args) {
        Creator vine = new CreateVine();
        vine.someOperation();
        Creator cheese = new CreateCheese();
        cheese.someOperation();
    }
}

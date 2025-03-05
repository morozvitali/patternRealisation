package main.java.com.moroz.fabric.creator;

import main.java.com.moroz.fabric.product.Cheese;
import main.java.com.moroz.fabric.product.Product;

public class CreateCheese extends Creator {


    @Override
    public Product createProduct() {
        return new Cheese();
    }
}

package main.java.com.moroz.fabric.creator;

import main.java.com.moroz.fabric.product.Product;

public abstract class Creator {

    public void someOperation() {
        Product product = createProduct();
        product.doStuff();
    }

    public abstract Product createProduct ();
}

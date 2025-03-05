package main.java.com.moroz.fabric.creator;

import main.java.com.moroz.fabric.product.Product;
import main.java.com.moroz.fabric.product.Vine;

public class CreateVine extends Creator {
    @Override
    public Product createProduct() {
        return new Vine();
    }
}

package pl.javastart.task.app;

import pl.javastart.task.model.Product;
import pl.javastart.task.logic.ProductManager;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Mleko", "Mleko bez laktozy", 3.89, Product.CATEGORY_DAIRY);
        Product product2 = new Product("Puzzle", "Puzzle 1500 elementów", 39.99);
        Product product3 = new Product("Baton", "Baton Bounty", 2.69, Product.CATEGORY_SWEETS);
        Product product4 = new Product("Bułka", "Bułka pszenno-żytnia z ziarnami",
                0.89, Product.CATEGORY_BREAD);

        ProductManager manager = new ProductManager();
        manager.showFullInfo(product1);
        manager.showFullInfo(product2);
        manager.showFullInfo(product3);
        manager.showFullInfo(product4);
    }
}

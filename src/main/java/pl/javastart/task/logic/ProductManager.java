package pl.javastart.task.logic;

import pl.javastart.task.model.Product;

public class ProductManager {
    private double calculateBruttoPrice(Product product) {
        String category = product.getCategory();
        if (category == null) {
            category = "";
        }
        return switch (category) {
            case "Pieczywo" -> product.getNettoPrice() * 1.08;
            case "Nabiał" -> product.getNettoPrice() * 1.05;
            default -> product.getNettoPrice() * 1.23;
        };
    }

    public void showFullInfo(Product product) {
        System.out.print(product.getProductInfo() + " - ");

        double bruttoPrice = calculateBruttoPrice(product);
        System.out.printf("cena brutto: %.2fzł\n", bruttoPrice);
    }
}

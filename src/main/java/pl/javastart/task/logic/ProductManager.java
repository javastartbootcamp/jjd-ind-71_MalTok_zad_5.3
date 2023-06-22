package pl.javastart.task.logic;

import pl.javastart.task.model.Product;

public class ProductManager {
    public static final double VAT_BREAD = 8;
    public static final double VAT_DAIRY = 5;
    public static final double VAT_DEFAULT = 23;

    private double calculateBruttoPrice(Product product) {
        String category = product.getCategory();
        if (category == null) {
            category = "";
        }
        return switch (category) {
            case Product.CATEGORY_BREAD -> product.getNettoPrice() * (1 + VAT_BREAD / 100);
            case Product.CATEGORY_DAIRY -> product.getNettoPrice() * (1 + VAT_DAIRY / 100);
            default -> product.getNettoPrice() * (1 + VAT_DEFAULT / 100);
        };
    }

    public void showFullInfo(Product product) {
        System.out.print(product.getProductInfo() + " - ");

        double bruttoPrice = calculateBruttoPrice(product);
        System.out.printf("cena brutto: %.2fzł\n", bruttoPrice);
    }
}

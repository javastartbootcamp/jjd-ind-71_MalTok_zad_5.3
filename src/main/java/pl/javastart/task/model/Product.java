package pl.javastart.task.model;

public class Product {
    private String name;
    private String description;
    private double nettoPrice;
    private String category;

    public Product(String name, String description, double nettoPrice, String category) {
        this.name = name;
        this.description = description;
        this.nettoPrice = nettoPrice;
        this.category = category;
    }

    public Product(String name, String description, double nettoPrice) {
        this.name = name;
        this.description = description;
        this.nettoPrice = nettoPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(double nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductInfo() {
        if (getCategory() != null) {
            return getName() + " - " + getDescription() + " - " + getCategory() + " - cena netto: " + getNettoPrice() +
                    "zł";
        } else {
            return getName() + " - " + getDescription() + " - " + "brak kategorii" + " - cena netto: " + getNettoPrice() +
                    "zł";
        }
    }
}

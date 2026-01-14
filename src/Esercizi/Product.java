package Esercizi;

public class Product {

    private String category;
    private String name;
    private long id;
    private double price;

    public Product(long id, String category, String name, double price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;


    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }
}

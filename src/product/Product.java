package product;

import java.util.ArrayList;

public abstract class Product implements Comparable {

    private static int last_ID = 0;
    private final int ID;
    protected String name;
    protected String brand;
    protected String seller;
    protected String description;
    protected long price;
    protected int available;
    public String info;
    public static String comments;
    private double score;
    private static int total_commenters = 0;
    private static int total_score = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public Product(String name, String seller, String description,long price) {
        this.name = name;
        this.seller = seller;
        this.description = description;
        ID = ++last_ID;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", seller='" + seller + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        total_commenters ++;
        total_score+= score;

        this.score = total_score/total_commenters;
    }


    public int compareTo(Object obj) {
        Product product = (Product) obj;
        // if the string are not equal
        if (this.name.compareTo(product.name) != 0) {
            return 1;
        }
        else if (this.name.compareTo(product.name) == 1){
            // we compare int values
            // if the strings are equal0
            if (this.price<product.price)
            {

            }
        }
    return 0;
    }
}


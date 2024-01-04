package models;
import java.util.Arrays;

public class Tshirt {
    String name;
    int productcode;
    int price;
    String brand;
    String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAvailablesizes() {
        return availablesizes;
    }

    public void setAvailablesizes(String[] availablesizes) {
        this.availablesizes = availablesizes;
    }

    String[] availablesizes;

    public Tshirt(String name, int productcode, int price, String brand, String description, String[] availablesizes) {
        this.name = name;
        this.productcode = productcode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.availablesizes = availablesizes;
    }
    public void tshirt_display(){
        System.out.println("Item Name: "+ this.name);
        System.out.println("Description: "+ this.description);
        System.out.println("Product Code: "+ this.productcode);
        System.out.println("Brand: "+ this.brand);
        System.out.println("Price: "+ this.price);
        System.out.println("Sizes: "+ Arrays.toString(this.availablesizes));
    }
}

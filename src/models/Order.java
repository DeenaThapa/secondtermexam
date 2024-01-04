package models;

public class Order {
    String name;
    long contact;
    String productcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public Order(String name, long contact, String productcode, int[] price) {
        this.name = name;
        this.contact = contact;
        this.productcode = productcode;
        this.price = price;
    }

    int[] price;

    public void billdisplayer(){
        System.out.println("Name: "+ this.name);
        System.out.println("Phone Number: "+ this.contact);
        System.out.println("Item Code: "+ this.productcode);
        double total=0;
        for(int n=0; n<this.price.length; n++){
            total= total + this.price[n];
        }
        double vat= (0.17*total);
        double grandtotal = total+vat;
        System.out.println("Price: "+ grandtotal);
    }
}

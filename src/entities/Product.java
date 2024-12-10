package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        if(this.quantity < quantity){
            System.out.println("It's not possible to remove this quantity.");
        } else{
            this.quantity -= quantity;
            System.out.println("Operation: Remove was successfully executed.");
        }
    }
    public void changeProductPrice(double newprice){
        this.price += newprice;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}

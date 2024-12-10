package application;

import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter data product");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        
        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println("Total value in stock:" + product.totalValueInStock());

        System.out.println("Would you like to add more units of this product? (Y/N)");
        char ans = sc.next().charAt(0);
        veririfyOption(ans);
        System.out.print("How many products do you want do add?");
        int newQuantity = sc.nextInt();
        product.addProducts(newQuantity);

        System.out.println("Would you like to remove some of this product? (Y/N)");
        ans = sc.next().charAt(0);
        veririfyOption(ans);
        System.out.print("How many products do you want to remove?");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);

        System.out.println("Would you like to change the product price? (Y/N)");
        ans = sc.next().charAt(0);
        veririfyOption(ans);
        System.out.print("Set new price: ");
        price = sc.nextDouble();

        System.out.println("New product data" + product);

    sc.close();
    }

    public static void veririfyOption(char ans){
        Scanner sc = new Scanner(System.in);

        if(ans == 'y' || ans == 'Y') {
            
            
        } else{
            System.out.println("All rigth! Executing next step");
        }
    }
    public static void veririfyInteger(int quantity){
        if(quantity > 2147483647){
            System.out.println("It's impossible to reconize this character");
        }
    }
}
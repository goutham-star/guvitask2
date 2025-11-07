package guvitask2;

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}


public class ProductMain {

    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);

        }

        
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (Product p : products) {
            if (p.price > maxPrice) {
                maxPrice = p.price;
                maxPid = p.pid;
            }

        }


        System.out.println("Product with highest price has PID: " + maxPid);

        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        sc.close();
    }
}

/*Output

Enter details for product 1:
Product ID: 101
Price: 500
Quantity: 3

Enter details for product 2:
Product ID:102
Price: 700
Quantity: 2

Enter details for product 3:
Product ID: 103
Price: 100
Quantity: 1

Enter details for product 4:
Product ID: 104
Price: 1500
Quantity: 2

Enter details for product 5:
Product ID: 105
Price: 1000
Quantity: 2


Product with highest price has PID: 104
Total amount spend on all products: 7300.0
*/
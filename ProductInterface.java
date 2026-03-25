import java.util.Scanner;

interface Bill {
    void calculate();
}

class Product implements Bill {
    int productId;
    String name;
    int quantity;
    double unitPrice;
    double total;

    Product(int productId, String name, int quantity, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void calculate() {
        total = quantity * unitPrice;
    }
}

public class ProductInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order No: ");
        int orderNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] p = new Product[n];
        double netAmount = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Unit Price: ");
            double price = sc.nextDouble();

            p[i] = new Product(id, name, qty, price);
            p[i].calculate();

            netAmount += p[i].total;
        }

        System.out.println("\nOrder No: " + orderNo);
        System.out.println("Date: " + date);

        System.out.println("\nProduct ID\tName\tQty\tUnit Price\tTotal");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(p[i].productId + "\t\t" + p[i].name + "\t" +
                    p[i].quantity + "\t" + p[i].unitPrice + "\t\t" + p[i].total);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\tNet Amount: " + netAmount);

        sc.close();
    }
}
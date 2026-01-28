// Define a class product with data members pcode, pname & pprice. create 3 object of the class & find the product having the lowest price

import java.util.Scanner;

class Products {
    int pcode;
    String pname;
    double pprice;

    Products(int code,String name,double price) {
        pcode = code;
        pname = name;
        pprice = price;
    }

    void display(){
        System.out.println("Product code : " + pcode);
        System.out.println("Product name : " + pname);
        System.out.println("Product price : " + pprice);
    }
}

public class Product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Products[] prd = new Products[3];

        for(int i=0;i<3;i++) {
            System.out.println("Enter details of the product : ");

            System.out.println("Enter product code : ");
            int code = sc.nextInt();

            System.out.println("Enter product name : ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Enter product price : ");
            double price = sc.nextDouble();

            prd[i] = new Products(code,name,price);
        }

        Products lowest = prd[0];

        for(int i=1;i<3;i++) {
            if (prd[i].pprice < lowest.pprice){
                lowest = prd[i];
            }
        }

        System.out.println("Product with Lowest Price : ");
        lowest.display();

        sc.close();
    }
}
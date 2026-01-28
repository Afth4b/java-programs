// Java program to add two complex numbers

import java.util.Scanner;

class Complex{
    int real;
    int img;

    Complex(int r,int i){
        real = r;
        img = i;
    }

    Complex add(Complex c){
        int real = this.real + c.real;
        int img = this.img + c.img;
        return new Complex(real,img);
    }

    void display(){
        System.out.println(real + " + i"+ img);
    }
}

public class ComplexNumAdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real parts of first number : ");
        int r1 = sc.nextInt();

        System.out.print("Enter imaginary part of first number : ");
        int img1 = sc.nextInt();
        

        System.out.print("Enter real parts of second number : ");
        int r2 = sc.nextInt();

        System.out.print("Enter imaginary part of second number : ");
        int img2 = sc.nextInt();


        Complex a = new Complex(r1,img1);
        Complex b = new Complex(r2,img2);

        Complex sum = b.add(a);


        System.out.println("Sum of complex numbers = ");
        sum.display();

        sc.close();
    }
}
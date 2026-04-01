// Define 2 classes; one for generating Fibonacci numbers and other for displaying even
// numbers in a given range. Implement using threads. (Runnable Interface) 

import java.util.*;
class Fibonacci implements Runnable{
    int n;

    Fibonacci(int limit) {
        n = limit;
    }

    public void run() {
        int a=0, b=1, c;

        System.out.println("Fibonacci series : ");
        for(int i=1; i<=n; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}

class Even implements Runnable{
    int start, end;

    Even(int a, int b) {
        start = a;
        end = b;
    }

    public void run() {
        System.out.println("Even Numbers : ");
        for (int i=start; i<=end; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class RunnableInterface{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Fibonacci numbers : ");
        int n = sc.nextInt();

        System.out.println("Enter the start and end range for even numbers : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        Thread f = new Thread(new Fibonacci(n));
        Thread e = new Thread(new Even(start, end));

        f.start();
        e.start();
    }
}
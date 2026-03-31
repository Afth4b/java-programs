/*   Define 2 classes; 
one for generating multiplication table of 5 
and other for displaying first Nprime numbers.
 Implement using thread class.*/

import java.util.*;

class Multiple5 extends Thread{
    public void run(){
        for(int i=1; i<=10; i++) {
            System.out.println(i + " x 5 = " + (i * 5));
        }
    }
}

class Prime extends Thread{
    int n;

    Prime(int limit){
        n = limit;
    }

    boolean isPrime(int num){
        if(num < 1){
            return false;
        }

        for(int i=2; i<= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }

    public void run(){
        for(int i=2; i<=n; i++) {
            if(isPrime(i)){
                System.out.println("Prime : "+i);
            }
        }
    }
}

public class MultiPrimeThread{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit for generating primes : ");
        int n = sc.nextInt();

        Multiple5 t1 = new Multiple5();
        Prime t2 = new Prime(n);

        t1.start();
        t2.start();

        sc.close();
    }
}
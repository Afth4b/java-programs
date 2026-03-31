//Find the average of N positive integers, raising a user defined exception for each negative input.

import java.util.*;

class NegativeException extends RuntimeException{
    NegativeException(String s){
        super(s);
    }
}

class NegativeNumExc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int nos[] = new int[n];
        double sum = 0;

        System.out.print("Enter "+ n + " numbers : ");

        for(int i=0; i<n ;i++) {
            try{
                nos[i] = sc.nextInt();
                if(nos[i] < 0){
                    throw new NegativeException("Negative number is not allowed!");
                }

                sum += nos[i];
            }catch(NegativeException e){
                System.out.println(e.getMessage());
                System.out.println("Program terminated.");
                return;
            }
        }

        double avg = sum/n;
        System.out.println("Average : " + String.format("%.2f",avg));

        sc.close();
    }
}
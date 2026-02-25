import java.util.Scanner;
import java.util.Arrays;

public class StringSort{
    public static void main(String[] args){
        System.out.print("Enter the number of strings to compare : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter string " + (i+1) + " : ");
            arr[i] = sc.nextLine();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Strings : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
import java.util.Scanner;

class ArraySearch {

    int[] arr;     // Data member
    int size;

    // Constructor
    ArraySearch(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Method to insert elements
    void insertElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to search element
    void searchElement(int key) {
        boolean found = false;

        for(int i = 0; i < size; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found in the array.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Creating object
        ArraySearch obj = new ArraySearch(n);

        obj.insertElements();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        obj.searchElement(key);
    }
}

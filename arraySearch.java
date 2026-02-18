import java.util.Scanner;

class Search{
    int[] array;
    int size;

    Search(int size){
        this.size = size;
        array = new int[size];
    }

    void insertElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : " );
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
    }

    void searchElement(int key){
        boolean isfound = false;

        for(int i=0; i<size; i++){
            if(key == array[i]){
                isfound = true;
                System.out.println(key+ " founded at position : "+(i+1));
                break;
            }
        }

        if(!isfound){
            System.out.println(key + " is not presented in this array..!!!");
        }
    }

}

public class arraySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        if(n <= 0 || n > 0 ){
            System.out.println("Invalid size..!!");
            return;
        }

        Search obj = new Search(n);
        obj.insertElement();

        System.out.println("Enter the element to search : ");
        int key = sc.nextInt();
        obj.searchElement(key);

    }
}



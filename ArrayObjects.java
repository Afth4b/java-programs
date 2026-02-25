import java.util.Scanner;

public class ArrayObjects{

        int id;
        String name;
        ArrayObjects(int id, String name){
            this.id = id;
            this.name = name;
        }

        void display(){
            System.out.println("Student ID : " + id);
            System.out.println("Student Name : " + name);
        }

    public static void main(String[] args){

        int id;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of objects : ");
        int num = sc.nextInt();

        ArrayObjects[] student = new ArrayObjects[num];

        for(int i=0;i<num;i++){
            System.out.println("Enter student details "+(i+1)+" : ");
            System.out.print("ID : ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            name = sc.nextLine();
            student[i] = new ArrayObjects(id,name);
        }
        
        for(int i=0;i<num;i++){
            student[i].display();
        }


    }
}
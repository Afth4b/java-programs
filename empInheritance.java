/* Create a class ‘Employee’ with data members Empid, Name, Salary, Address and
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the
properties of class employee and contain its own data members department, Subjects taught
and constructors to initialize these data members and also include display function to
display all the data members. Use array of objects to display details of N teachers. */

import java.util.Scanner;

class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;

    Employee(int Empid, String Name, double Salary, String Address){
        this.Empid = Empid;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int Empid, String Name, double Salary, String Address, String department, String subject){
        super(Empid, Name, Salary, Address);
        this.department = department;
        this.subject = subject;
    }

    void display(){
        System.out.println("Employee ID : " + Empid);
        System.out.println("Name : " + Name);
        System.out.println("Salary : " + Salary);
        System.out.println("Address : " + Address);
        System.out.println("Department : " + department);
        System.out.println("Subject Taught : " + subject);
        System.out.println("--------------------------------");
    }
}

public class empInheritance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Teachers : ");
        int n = sc.nextInt();
        sc.nextLine(); // only once needed here

        Teacher[] teachers = new Teacher[n];

        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Employee ID : ");
            int Empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name : ");
            String Name = sc.nextLine();

            System.out.print("Salary : ");
            double Salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address : ");
            String Address = sc.nextLine();

            System.out.print("Department : ");
            String department = sc.nextLine();

            System.out.print("Subject taught : ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(Empid, Name, Salary, Address, department, subject);
        }

        System.out.println("\nTeacher Details : ");
        for(int i = 0; i < n; i++){
            teachers[i].display();
        }

        sc.close();
    }
}
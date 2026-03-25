/** Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and also contain constructors and methods to display the data
members. Use array of objects to display details of N teachers. **/

import java.util.Scanner;

// Base class
class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor
    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Derived class Employee
class Employee extends Person {
    int empid;
    String company_name;
    String qualification;
    double salary;

    // Constructor
    Employee(String name, String gender, String address, int age,
             int empid, String company_name, String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Derived class Teacher
class Teacher extends Employee {
    String subject;
    String department;
    int teacherid;

    // Constructor
    Teacher(String name, String gender, String address, int age,
            int empid, String company_name, String qualification, double salary,
            String subject, String department, int teacherid) {

        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Teacher ID: " + teacherid);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("-----------------------------------");
    }
}

// Main class
public class persInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Company Name: ");
            String company = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Teacher ID: ");
            int tid = sc.nextInt();
            sc.nextLine();

            t[i] = new Teacher(name, gender, address, age,
                               empid, company, qualification, salary,
                               subject, dept, tid);
        }

        System.out.println("\n--- Teacher Details ---");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}
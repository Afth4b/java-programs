/* Create classes Student and Sports. Create another class Result inherited from Student and
Sports. Display the academic and sports score of a student */

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int academicScore;

    Student(int rollNo, String name, int academicScore) {
        this.rollNo = rollNo;
        this.name = name;
        this.academicScore = academicScore;
    }
}

interface Sports {
    int sportsScore = 0;
}

class Result extends Student implements Sports {
    int sportsMark;

    Result(int rollNo, String name, int academicScore, int sportsMark) {
        super(rollNo, name, academicScore);
        this.sportsMark = sportsMark;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsMark);
    }
}

public class StudMultiInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Academic Score: ");
        int academic = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int sports = sc.nextInt();

        Result r = new Result(roll, name, academic, sports);

        System.out.println("\n--- Result ---");
        r.display();

        sc.close();
    }
}
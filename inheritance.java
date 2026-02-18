class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class Teacher extends Employee{
    String dept;
    int subjectCode;
    String subjectName;

    Teacher(int id, String name, double salary, String dept, int subjectCode, String subjectName){
        super(id,name,salary);
        this.dept = dept;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    void display(){
        System.out.println("ID : "+ id);
        System.out.println("Name : "+ name);
        System.out.println("Salary : "+ salary);
        System.out.println("Department : "+ dept);
        System.out.println("Subject Code : "+ subjectCode);
        System.out.println("Subject Name : "+ subjectName);
    }

    public static void main(String[] args){
        Teacher obj = new Teacher(123,"Afthab",20000,"CS",101,"CPP");
        obj.display();
    }
}
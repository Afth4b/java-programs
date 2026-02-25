class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("This animal barks..!!");
    }
}

public class SingleInheritance{
    public static void main(String[] args){
        Dog dog = new Dog();

        dog.bark();
        dog.eat();
    }
}
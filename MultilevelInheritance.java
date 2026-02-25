class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("This animal barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("This puppy weeps");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.weep();   // From Puppy
        p.bark();   // From Dog
        p.eat();    // From Animal
    }
}
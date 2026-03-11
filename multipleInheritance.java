interface A{
    void showA();
}

interface B{
    void showB();
}

class multipleInheritance implements A,B{
    public void showA(){
        System.out.println("Interface A method");
    }

    public void showB(){
        System.out.println("Interface B method");
    }

    public static void main(String[] args){
        multipleInheritance obj = new multipleInheritance();
        obj.showA();
        obj.showB();
    }
}
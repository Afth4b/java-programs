class Constructer{

    int l,b;

    Constructer(int length,int breadth){
        l = length;
        b= breadth;
    }

    void area(){
        System.out.println("Area is : "+l*b);
    }

    public static void main(String[] args){
        Constructer obj = new Constructer(10,5);
        obj.area();

    }
}
public class FunctionOverload{
    int add(int a,int b){
        return(a+b);
    }

    int add(int a, int b, int c){
        return (a+b+c);
    }

    double add(double a, double b){
        return (a+b);
    }

    public static void main(String[] args){
        FunctionOverload calc = new FunctionOverload();

        System.out.println("10 + 5 : "+calc.add(10,5));
        System.out.println("10 + 5 + 6 : "+calc.add(10,5,6));
        System.out.println("10.6 + 5.2 : "+calc.add(10.6,5.2));
    }
}
import java.io.*;
class MathOperations{
    int add(int a, int b){
        return a+b;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[]args){
        MathOperations obj= new MathOperations();
        System.out.println("SUM: "+obj.add(5,3));
        System.out.println("Product: "+obj.multiply(3,5));
    }
}
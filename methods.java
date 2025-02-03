//2 methods static and instance

import java.io.*;
class Calculator{
    //instance
    int add(int a, int b){
        return a+b;
    }
    //static
    static int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[]args){
        Calculator obj=new Calculator();
        System.out.println("SUM: "+obj.add(2,5));
        System.out.println("PRODUCT: "+obj.multiply(2,5));
    }
}
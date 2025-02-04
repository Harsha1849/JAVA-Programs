//java program to perform arithmetic operations with class Arithmetic and methods void add(), void subtract(int a, int b), int multiply(), int divide(int a, int b)
import java.io.*;
class Arithmetic
{
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    int multiply(int a, int b){
        return a*b;
    }

    int divide(int a, int b){
        return a/b;
    }

    public static void main(String[]args)
    {
        Arithmetic art= new Arithmetic();
        art.add(2,2);
        art.subtract(4,2);
        System.out.println("Product: "+art.multiply(5,5));
        System.out.println("Quotient: "+art.divide(10,2));
    }
}
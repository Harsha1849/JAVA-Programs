import java.io.*;
class MathOps {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOps obj = new MathOps();
        System.out.println("Sum (int): " + obj.add(5, 3));
        System.out.println("Sum (double): " + obj.add(5.5, 3.2));
    }

}
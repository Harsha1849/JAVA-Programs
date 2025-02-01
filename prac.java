import java.io.*;
class MathOperations {
    // Instance method
    int add(int a, int b) {
        return a + b;
    }
    
    // Static method
    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println("Sum: " + obj.add(5, 3));
        System.out.println("Product: " + MathOperations.multiply(4, 2));
    }
}

class Car {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 120;
        myCar.display();
    }
}

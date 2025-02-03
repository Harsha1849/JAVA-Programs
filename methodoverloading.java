import java.io.*;
class AreaCalculator{
    int calculateArea(int a, int b){
        return a*b;
    }

    double calculateArea(double a){
        return 3.14*a*a;
    }

    public static void main(String[]args){
        AreaCalculator obj=new AreaCalculator();
        System.out.println("Area of rectangle: "+obj.calculateArea(5,3));
        System.out.println("Area of circle: "+obj.calculateArea(5));
    }
}
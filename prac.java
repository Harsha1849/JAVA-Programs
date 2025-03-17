//class and object

// class Student{
//     String name;
//     int USN;

//     void display()
//     {
//         System.out.println("Name:" + name + ", USN:" + USN);
//     }

//     public static void main(String[]args)
//     {
//         Student stu=new Student();
//         stu.name= "ABC";
//         stu.USN= 55;
//         stu.display();
//     }
// }

//methods

// class Meth{
//     int add(int a, int b){
//         return a+b;
//     }

//     static int multiply(int a, int b){
//         return a*b;
//     }

//     public static void main(String[]args)
//     {
//         Meth me=new Meth();
//         System.out.println("Sum = "+me.add(4,5));
//         System.out.println("Product = "+ Meth.multiply(4, 5));
//     }
// }

//Method Overloading

// class MathOps{
//     int add(int a, int b){
//         return a+b;
//     }

//     double add(double a, double b){
//         return a+b;
//     }

//     public static void main(String[]args){
//         MathOps ma=new MathOps();
//         System.out.println("Sum using integer: "+ma.add(5, 8));
//         System.out.println("Sum using double: "+ma.add(5,8));
//     }
// }

//Constructor

// class Con{
//     String name;

//     Con(String n){
//         name=n;
//     }

//     void display()
//     {
//         System.out.println("Student Name: " +name);
//     }

//     public static void main(String args[]){
//         Con c= new Con("alice");
//         c.display();
//     }
// }

//inheritance

// class Employee
// {
//     int Salary=60000;
// }

// class Employer extends Employee
// {
//     int increment=20000;
// }

// class prac
// {
//     public static void main(String[] args) {
//         Employer e1=new Employer();
//         System.out.println("Salary: "+e1.Salary+ " Benefits: "+e1.increment);
//     }
// }

//inheritance using super keyword

// class Parent{
//     Parent()
//     {
//         System.out.println("Parent class");
//     }
// }

// class Child extends Parent{
//     Child()
//     {
//         super();
//         System.out.println("Child class");
//     }
// }

// public class prac{
//     public static void main(String[]args)
//     {
//         Child ch=new Child();
//     }
// }

//method overriding

class Parent{
    void show()
    {
        System.out.println("Parent show class");
    }
}
class Child extends Parent{
    @Override
    void show()
    {
        System.out.println("Child show class");
    }
}
class prac
{
    public static void main(String[]args)
    {
        Child ch=new Child();
        ch.show();
    }
}
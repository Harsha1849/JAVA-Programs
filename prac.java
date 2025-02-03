import java.io.*;

class Person{
    String name;
    int age;

    void display(){
        System.out.println("Name: " + name + ", Age: "+age);
    }

    public static void main(String[] args)
    {
        Person myperson=new Person();
        myperson.name="nigga";
        myperson.age=20;
        myperson.display();
    }
}
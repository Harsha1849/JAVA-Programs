import java.util.Scanner;

class A
{ String name; int age;
    A()
    {
        System.out.println("constructor");
    }
    A(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
}

class constructoruser
{
    public static void main(String args[])
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String str = input.nextLine();
        System.out.println("Enter a age");
        int x = input.nextInt();
        A a1=new A (str,x);
        a1.display();

    }
}
class A{
    int a=10;
    
    // void show(){
    //     System.out.println("Super Class");
    // }

    // void show(int x){
    //     System.out.println(x);
    // }
    A(){
        System.out.println("Constructor with parent class");
    }
}

class B extends A{
    int a=20;
    
    // void show()
    // {
    //     System.out.println(super.a); //to get parent class output
    //     System.out.println(.a); //to get sub class output
    // }

    // void show(){
    //     super.show(); //to bring super class output
    //     System.out.println("Sub class"); // | use "//" to just get output of parent class |
    // } 

    // void show(int x){
    //     super.show(100);
    //     System.out.println("Sub class");
    //     System.out.println(x);
    // }

    B(){
        System.out.println("B with constructor");
    }
}

class superclass{
    public static void main(String args[]){
        B b1= new B();
        // b1.show();
        // b1.show(1000);
    }
}
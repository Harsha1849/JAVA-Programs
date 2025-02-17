class A {
    A() {
        System.out.println("Class A with constructor");
    }

    void show() {
        System.out.println("Class A with method");
    }
}

class B extends A {
    B() {
        System.out.println("Class B with constructor");
    }

    void view() {
        System.out.println("Class B with method");
    }
}

class inheritance {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        B obj2 = new B();
        obj2.view();
    }
}


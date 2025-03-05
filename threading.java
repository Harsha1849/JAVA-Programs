class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("class A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("class B");
        }
    }
}

public class threading {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}
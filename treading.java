class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("class A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("class B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class treading {
    public static void main(String[] args) {
        A t1 = new A(); 
        B t2 = new B();
        t1.start(); 
        t2.start();
    }
}
public class assignment2 {

    void sumWithoutReturnWithoutArguments() {
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Sum (without return, without arguments): " + sum);
    }

    void sumWithoutReturnWithArguments(int a, int b) {
        int sum = a + b;
        System.out.println("Sum (without return, with arguments): " + sum);
    }

    int sumWithReturnWithoutArguments() {
        int a = 15, b = 25;
        return a + b;
    }

    int sumWithReturnWithArguments(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        assignment2 obj = new assignment2();

        
        obj.sumWithoutReturnWithoutArguments();


        obj.sumWithoutReturnWithArguments(30, 40);

        int result1 = obj.sumWithReturnWithoutArguments();
        System.out.println("Sum (with return, without arguments): " + result1);

        int result2 = obj.sumWithReturnWithArguments(50, 60);
        System.out.println("Sum (with return, with arguments): " + result2);
    }
}
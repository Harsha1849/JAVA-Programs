class Arithmetic 
{
    void calculate(int a, int b) 
    {
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
    }

    public static void main(String[] args) 
    {
        Arithmetic obj = new Arithmetic();
        obj.calculate(10, 2);
    }
}

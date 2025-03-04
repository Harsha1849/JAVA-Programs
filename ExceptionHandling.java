import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        
        try {
            int number = Integer.parseInt(input); 
            int result = 100 / number;  
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}
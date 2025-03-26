import java.util.Arrays;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Hello, Java Programming!  ";
        String anotherStr = "hello, java programming!";

        System.out.println("Original String: \"" + str + "\"");
        System.out.println("Length of String: " + str.length());
        System.out.println("Character at Index 7: " + str.charAt(7));
        System.out.println("Substring (7, 11): " + str.substring(7, 11));

        String concatenated = str.concat(" Enjoy coding!");
        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replacing 'Java' with 'Python': " + str.replace("Java", "Python"));

        System.out.println("Strings are equal: " + str.equals(anotherStr));
        System.out.println("Ignoring case, strings are equal: " + str.equalsIgnoreCase(anotherStr));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with '!': " + str.endsWith("!"));
        System.out.println("Is empty: " + str.isEmpty());

        String trimmedStr = str.trim();
        System.out.println("Trimmed String: \"" + trimmedStr + "\"");

        String[] words = trimmedStr.split(" ");
        System.out.println("Split into words: " + Arrays.toString(words));

        System.out.println("\nAll String methods demonstrated successfully!");
    }
}
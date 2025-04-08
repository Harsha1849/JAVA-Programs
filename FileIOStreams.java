import java.io.*;

public class FileIOStreams {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (FileInputStream fis = new FileInputStream(inputFile);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {
            
            System.out.println("Reading from " + inputFile + "...");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream(outputFile);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos))) {
            
            String content = "Hello, this is a test message written to the file!";
            writer.write(content);
            writer.newLine();
            System.out.println("Data written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
import java.io.*;

class Student {
    String name;
    int rollNumber;
    int[] marks;

    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Total Marks: " + calculateTotalMarks());
    }
}

public class assignment1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of students: ");
        int numberOfStudents = Integer.parseInt(br.readLine());

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();

            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter name: ");
            students[i].name = br.readLine();

            System.out.print("Enter roll number: ");
            students[i].rollNumber = Integer.parseInt(br.readLine());

            System.out.print("Enter number of subjects: ");
            int numberOfSubjects = Integer.parseInt(br.readLine());
            students[i].marks = new int[numberOfSubjects];

            System.out.println("Enter marks:");
            for (int j = 0; j < numberOfSubjects; j++) {
                students[i].marks[j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("\nStudent Reports:");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}

class Student {
    String name;

    // Constructor
    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        s1.display();
    }
}

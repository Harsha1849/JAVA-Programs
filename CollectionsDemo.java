import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        System.out.println("=== List Implementation (ArrayList) ===");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println("Original List: " + fruits);

        fruits.set(1, "Orange");  
        System.out.println("After Update: " + fruits);

        fruits.remove("Mango");  // Remove
        System.out.println("After Removal: " + fruits);

        System.out.println("Element at index 0: " + fruits.get(0));  

        System.out.println("\n=== Set Implementation (HashSet) ===");
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate
        System.out.println("HashSet Elements (No Duplicates): " + names);

        System.out.println("\n=== Queue Implementation (PriorityQueue) ===");
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(40);
        numbers.offer(10);
        numbers.offer(30);
        numbers.offer(20);
        System.out.println("Queue (PriorityQueue): " + numbers);

        System.out.println("Dequeue Element: " + numbers.poll());
        System.out.println("Queue After Dequeue: " + numbers);

        System.out.println("\n=== Map Implementation (HashMap) ===");
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "John");
        students.put(102, "Emma");
        students.put(103, "Alex");

        System.out.println("All Students: " + students);
        System.out.println("Student with ID 102: " + students.get(102));

        System.out.println("Iterating through Map:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
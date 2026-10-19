import java.util.ArrayList;
import java.util.List;

class Student<T> {
    private String name;
    private T marks;

    public Student(String name, T marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public T getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class StudentManager<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T value) {
        list.add(value);
    }

    public void display() {
        for (T value : list) {
            System.out.println(value);
        }
    }

    public int getSize() {
        return list.size();
    }

    public boolean search(T value) {
        return list.contains(value);
    }

    public void remove(T value) {
        list.remove(value);
    }

    public T getFirst() {
        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }
}

public class JavaGenerics {
    public static void main(String[] args) {

        System.out.println("STUDENT DETAILS");

        Student<Integer> s1 = new Student<>("Amit", 85);
        Student<Integer> s2 = new Student<>("Rahul", 72);
        Student<Integer> s3 = new Student<>("Priya", 95);

        s1.display();
        s2.display();
        s3.display();

        System.out.println("\nGENERIC LIST");

        StudentManager<String> names = new StudentManager<>();

        names.add("Amit");
        names.add("Rahul");
        names.add("Priya");

        names.display();

        System.out.println("Total students: " + names.getSize());
        System.out.println("Is Rahul present? " + names.search("Rahul"));

        names.remove("Rahul");

        System.out.println("After removing Rahul:");
        names.display();

        System.out.println("First student: " + names.getFirst());

        System.out.println("\nGENERIC METHOD");

        printData("Hello Java");
        printData(100);
        printData(25.5);

        System.out.println("\nHIGHEST MARKS");

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(72);
        marks.add(95);
        marks.add(68);

        System.out.println("Highest marks: " + findHighest(marks));

        System.out.println("\nDISPLAY USING WILDCARD");

        displayList(marks);
    }

    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static <T extends Number> T findHighest(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }

        T highest = list.get(0);

        for (T num : list) {
            if (num.doubleValue() > highest.doubleValue()) {
                highest = num;
            }
        }

        return highest;
    }

    public static void displayList(List<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
}

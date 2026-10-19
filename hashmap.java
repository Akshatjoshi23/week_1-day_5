import java.util.HashMap;
import java.util.Objects;

class HashMapStudent {

    private final int id;
    private final String name;

    public HashMapStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        HashMapStudent other = (HashMapStudent) obj;

        return id == other.id &&
               Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class hashmap {

    public static void main(String[] args) {

        HashMap<HashMapStudent, Integer> marks = new HashMap<>();

        HashMapStudent student1 = new HashMapStudent(101, "Akshat");
        HashMapStudent student2 = new HashMapStudent(101, "Akshat");
        HashMapStudent student3 = new HashMapStudent(102, "Rahul");

        marks.put(student1, 85);
        marks.put(student2, 95);
        marks.put(student3, 80);

        System.out.println("----- HASHCODE -----");
        System.out.println("Student 1 hash: " + student1.hashCode());
        System.out.println("Student 2 hash: " + student2.hashCode());

        System.out.println("\n----- EQUALS -----");
        System.out.println("student1 == student2: " + (student1 == student2));
        System.out.println("student1.equals(student2): " + student1.equals(student2));

        System.out.println("\n----- HASHMAP RESULTS -----");
        System.out.println("Total students: " + marks.size());
        System.out.println("Student 1 marks: " + marks.get(student1));
        System.out.println("Student 2 marks: " + marks.get(student2));
        System.out.println("Student 3 marks: " + marks.get(student3));

        HashMapStudent student4 = new HashMapStudent(101, "Akshat");

        System.out.println("\n----- LOOKUP USING A NEW OBJECT -----");
        System.out.println("Student 4 marks: " + marks.get(student4));

        HashMap<Integer, String> collisionMap = new HashMap<>();

        collisionMap.put(1, "Java");
        collisionMap.put(17, "SQL");

        System.out.println("\n----- COLLISION DEMONSTRATION -----");
        System.out.println("Value for key 1: " + collisionMap.get(1));
        System.out.println("Value for key 17: " + collisionMap.get(17));
        System.out.println("\n----- IMMUTABILITY -----");
        System.out.println("Student ID and name cannot be reassigned because they are final.");
    }
}
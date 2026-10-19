import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {
         HashMap<String, Integer> map = new HashMap<>();

        map.put("Amit", 80);
        map.put("Rahul", 65);
        map.put("Priya", 90);
        map.put("Neha", 75);
        map.put("Ravi", 50);

        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());
        System.out.println("Marks of Amit: " + map.get("Amit"));
        System.out.println("Contains Rahul: " + map.containsKey("Rahul"));

        map.remove("Ravi");
        System.out.println("After removing Ravi: " + map);

        System.out.println("Highest marks: " + findHighest(map));
        System.out.println("Lowest marks: " + findLowest(map));
        System.out.println("Total marks: " + calculateSum(map));
        System.out.println("Average marks: " + calculateAverage(map));
        System.out.println("Students passed: " + countPassed(map));
        System.out.println("Students failed: " + countFailed(map));
    }

    private static Integer findHighest(HashMap<String, Integer> map) {
        Integer highest = null;

        for (int marks : map.values()) {
            if (highest == null || marks > highest) {
                highest = marks;
            }
        }

        return highest;
    }

    private static Integer findLowest(HashMap<String, Integer> map) {
        Integer lowest = null;

        for (int marks : map.values()) {
            if (lowest == null || marks < lowest) {
                lowest = marks;
            }
        }

        return lowest;
    }

    private static int calculateSum(HashMap<String, Integer> map) {
        int sum = 0;

        for (int marks : map.values()) {
            sum = sum + marks;
        }

        return sum;
    }

    private static double calculateAverage(HashMap<String, Integer> map) {
        if (map.isEmpty()) {
            return 0;
        }

        return (double) calculateSum(map) / map.size();
    }

    private static int countPassed(HashMap<String, Integer> map) {
        int count = 0;

        for (int marks : map.values()) {
            if (marks >= 60) {
                count++;
            }
        }

        return count;
    }

    private static int countFailed(HashMap<String, Integer> map) {
        int count = 0;

        for (int marks : map.values()) {
            if (marks < 60) {
                count++;
            }
        }

        return count;
    }
}

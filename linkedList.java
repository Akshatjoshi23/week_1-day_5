import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(10);

        System.out.println("LinkedList: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("Contains 9: " + list.contains(9));
        System.out.println("Index of 10: " + list.indexOf(10));

        list.remove(1);
        System.out.println("After removing index 1: " + list);

        System.out.println("Largest even: " + findLargestEven(list));
        System.out.println("Largest odd: " + findLargestOdd(list));
        System.out.println("Smallest: " + findSmallest(list));
        System.out.println("Sum: " + calculateSum(list));
        System.out.println("Average: " + calculateAverage(list));
        System.out.println("Even count: " + countEven(list));
        System.out.println("Odd count: " + countOdd(list));
    }

    private static Integer findLargestEven(LinkedList<Integer> list) {
        Integer largest = null;

        for (int num : list) {
            if (num % 2 == 0) {
                if (largest == null || num > largest) {
                    largest = num;
                }
            }
        }

        return largest;
    }

    private static Integer findLargestOdd(LinkedList<Integer> list) {
        Integer largest = null;

        for (int num : list) {
            if (num % 2 != 0) {
                if (largest == null || num > largest) {
                    largest = num;
                }
            }
        }

        return largest;
    }

    private static Integer findSmallest(LinkedList<Integer> list) {
        Integer smallest = null;

        for (int num : list) {
            if (smallest == null || num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    private static int calculateSum(LinkedList<Integer> list) {
        int sum = 0;

        for (int num : list) {
            sum = sum + num;
        }

        return sum;
    }

    private static double calculateAverage(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        return (double) calculateSum(list) / list.size();
    }

    private static int countEven(LinkedList<Integer> list) {
        int count = 0;

        for (int num : list) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int countOdd(LinkedList<Integer> list) {
        int count = 0;

        for (int num : list) {
            if (num % 2 != 0) {
                count++;
            }
        }

        return count;
    }
}
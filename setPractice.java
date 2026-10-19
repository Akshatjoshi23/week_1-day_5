import java.util.HashSet;

public class setPractice {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(10);

        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Is empty: " + set.isEmpty());
        System.out.println("Contains 9: " + set.contains(9));

        set.remove(9);
        System.out.println("After removing 9: " + set);

        System.out.println("Largest even: " + findLargestEven(set));
        System.out.println("Largest odd: " + findLargestOdd(set));
        System.out.println("Smallest: " + findSmallest(set));
        System.out.println("Sum: " + calculateSum(set));
        System.out.println("Average: " + calculateAverage(set));
        System.out.println("Even count: " + countEven(set));
        System.out.println("Odd count: " + countOdd(set));
    }

    private static Integer findLargestEven(HashSet<Integer> set) {
        Integer largest = null;

        for (int num : set) {
            if (num % 2 == 0) {
                if (largest == null || num > largest) {
                    largest = num;
                }
            }
        }

        return largest;
    }

    private static Integer findLargestOdd(HashSet<Integer> set) {
        Integer largest = null;

        for (int num : set) {
            if (num % 2 != 0) {
                if (largest == null || num > largest) {
                    largest = num;
                }
            }
        }

        return largest;
    }

    private static Integer findSmallest(HashSet<Integer> set) {
        Integer smallest = null;

        for (int num : set) {
            if (smallest == null || num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    private static int calculateSum(HashSet<Integer> set) {
        int sum = 0;

        for (int num : set) {
            sum = sum + num;
        }

        return sum;
    }

    private static double calculateAverage(HashSet<Integer> set) {
        if (set.isEmpty()) {
            return 0;
        }

        return (double) calculateSum(set) / set.size();
    }

    private static int countEven(HashSet<Integer> set) {
        int count = 0;

        for (int num : set) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int countOdd(HashSet<Integer> set) {
        int count = 0;

        for (int num : set) {
            if (num % 2 != 0) {
                count++;
            }
        }

        return count;

    }
}

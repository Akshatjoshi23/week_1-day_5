import java.util.*;
class SecondLargest{
    public void findSecondLargest(ArrayList<Integer> list){
    
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
  
        for(int n:list){
            if(n>largest){
                secondLargest=largest;
                largest=n;
            }
            else if(n>secondLargest && n!=largest){
                secondLargest=n;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
class FindDuplicates{
    public void findDuplicates(ArrayList<Integer> list){
      
        for(int n:list){
           for(int m=n+1;m<list.size();m++){
               if(n==list.get(m)){
                   System.out.println("Duplicate found: " + n);
                   break;
               }
           }
        }
    }
}

public class Arraylist {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(10);
        System.out.println("ArrayList: " + list);// Display the ArrayList
        System.out.println("Size of ArrayList: " + list.size());// Display the size of the ArrayList
        System.out.println("Element at index 2: " + list.get(2));// Display the element at index 2
        System.out.println("Is the ArrayList empty? " + list.isEmpty());// Check if the ArrayList is empty
        System.out.println("Does the ArrayList contain 9? " + list.contains(9));// Check if the ArrayList contains 9
        System.out.println("Index of 10: " + list.indexOf(10));// Display the index of 10
        list.remove(1);// Remove the element at index 1
        System.out.println("ArrayList after removing element at index 1: " + list);// Display the ArrayList after removal
        //SORTING
        list.sort(null);
        System.out.println("ArrayList after sorting: " + list);// Display the ArrayList after sorting
        
        //Reverse the ArrayList
        Collections.reverse(list);
        System.out.println("ArrayList after reversing: " + list);// Display the ArrayList after reversing
        
        //To find the second largest element in the ArrayList
        SecondLargest secondLargestFinder = new SecondLargest();
        secondLargestFinder.findSecondLargest(list);

        //To count the occurence of an element in the ArrayList
        int count=0;
        int target=10;
        for(int n:list){
            if(n==target){
                count++;
            }
        }
        System.out.println("Count of " + target + " in the ArrayList: " + count);

        //To find duplicates in the ArrayList
        FindDuplicates duplicateFinder = new FindDuplicates();
        duplicateFinder.findDuplicates(list);

        //Merging two ArrayLists
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list.addAll(list2);
        System.out.println("ArrayList after merging with list2: " + list);// Display the list after merging with list2
    }
}

import java.util.ArrayList;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).charAt(0) == 'a' || list.get(i).charAt(0) == 'A'){
               counter++;
            }
        }
        return counter;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) + "!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // for (int i = 0; i > length.list1)

        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        // REPLACE WITH YOUR CODE
        return 0;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        // REPLACE WITH YOUR CODE
        return null;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // REPLACE WITH YOUR CODE
        return null;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}

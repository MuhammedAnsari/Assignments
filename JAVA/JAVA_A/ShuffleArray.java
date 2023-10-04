// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);

        // Shuffle
        Collections.shuffle(myList);

        //  list to an array
        Integer[] shuffledArray = myList.toArray(new Integer[0]);

        // shuffled array
        for (Integer value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}

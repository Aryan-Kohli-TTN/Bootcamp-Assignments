package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        LinkedList<Integer> arr2 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>(Arrays.asList(1,2,3,4,5,6));

        // not used in TreeSet because it stores data in sorted way

        arr.addFirst(4);
        arr2.addFirst(62);
        set1.addFirst(36);
        arr.addLast(23);
        arr2.addLast(21);
        set1.addLast(100);

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(set1);

        arr.removeFirst();
        arr2.removeFirst();
        set1.removeFirst();
        arr.removeLast();
        arr2.removeLast();
        set1.removeLast();

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(set1);


    }
}

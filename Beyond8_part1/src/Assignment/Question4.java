package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        List<Integer> l2 = List.copyOf(l1);
        System.out.println(l2.getClass());

    }
}

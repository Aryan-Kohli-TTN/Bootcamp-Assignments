package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(13,42,23,432,326,643,243,24));
        arr.stream().filter(e->e>50).findFirst().stream().forEach(System.out::println);
    }
}

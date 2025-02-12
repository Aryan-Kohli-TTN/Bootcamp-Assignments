package AssignmentQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,6));
        System.out.println(arr.stream().filter(x->x>5).mapToInt(x->x).sum());
    }
}

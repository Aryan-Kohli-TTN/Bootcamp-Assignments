package AssignmentQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Question4 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("aryan",null,null,"Kohli","ji"));
        strings.forEach(s->{
            Optional<String> op = Optional.ofNullable(s);
            System.out.println(op.orElse("").toUpperCase());
        });
    }
}

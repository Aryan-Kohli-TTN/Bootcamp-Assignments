package Assignment;

import java.util.stream.IntStream;

public class Question1 {
    public static void main(String[] args) {
        IntStream.iterate(1,i->i<105,i->i+2).filter(i->i%3==0).forEach(System.out::println);
    }
}

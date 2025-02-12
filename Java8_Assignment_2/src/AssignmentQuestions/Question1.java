package AssignmentQuestions;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question1 {
    public static void main(String[] args) {
        Consumer<Integer> printData = (a)-> System.out.println("Number is "+a);
        printData.accept(10);

        Supplier<Float> getVal =()->4*122.323f/434.242f;
        System.out.println(getVal.get());

        int num=10;
        Predicate<Integer> isEven = (a)->a%2==0;
        System.out.println(isEven.test(num));

        Function<Integer,Float> operation = (a)->a*21.21f+54.212f;
        System.out.println(operation.apply(num));
    }

}

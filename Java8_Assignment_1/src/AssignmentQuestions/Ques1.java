package AssignmentQuestions;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Greater_interface{
    public boolean func(int a ,int b);
}
interface Increment_val{
    public int func(int a);
}
interface String_concat{
    public String func(String s1,String s2 );
}
interface Upperacse_convert{
    public String func(String s1 );
}
public class Ques1 {
    public static void main(String[] args) {
        // firstly doing all 4 parts by creating the
        // functional inteface. then using java.util.function interfaces

        Greater_interface obj1 = (a,b)->a>b?true:false;
        System.out.println(obj1.func(10,2));

        Increment_val obj2 = (a)->a+1;
        System.out.println(obj2.func(10));

        String_concat obj3 = (s1,s2)->s1+s2;
        System.out.println(obj3.func("Aryab ","Kohli"));

        Upperacse_convert obj4 = (s)->s.toUpperCase();
        System.out.println(obj4.func("fbeibfe"));

        BiFunction<Integer,Integer,Boolean> greaterFunc = (a,b)-> a>b?true:false;
        System.out.println(greaterFunc.apply(10,2));

        Function<Integer,Integer> incrementVal = (a)->a+1;
        System.out.println(incrementVal.apply(10));

        BiFunction<String ,String ,String> String_concat = (s1,s2)->s1+s2;
        System.out.println(String_concat.apply("Aryan","  kohli"));

        Function<String,String> uppercase_Convert = (s)->s.toUpperCase();
        System.out.println(uppercase_Convert.apply("abcdefgh"));

    }
}

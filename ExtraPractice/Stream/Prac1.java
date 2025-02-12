package practiceQuestions3;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.function.Predicate;

public class Prac1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,7,45,21,12,33,12,12,345,-67));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Vaibhav","ckbnwidn","vinid","jdbs","ndis","Arun","Aryan","abcba"));
        // convert a list of integers to squares
//        System.out.println(arr.stream().map(x->x*x).collect(Collectors.toList()));

        // fileter out even numbers
//        System.out.println(arr.stream().filter(x->x%2==0).collect(Collectors.toList()));

        //sum of all numbers (which is best)
//        System.out.println(arr.stream().reduce(0,(a,b)->a+b));
//        System.out.println(arr.stream().collect(Collectors.summingInt(a->a)));

        // to uppercase
//        System.out.println(names.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));
//        System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));

        // count of elements greater than num
//        int a=200;
//        System.out.println(arr.stream().filter(x->x>a).count());
//        System.out.println(arr.stream().filter(x->x>a).count());

        // max and min
//        System.out.println(arr.stream().sorted().skip(arr.size()-1).findFirst().get());
//        System.out.println(arr.stream().sorted().findFirst().get());

        // check if all elemets ar positive or not
//        boolean bb = arr.stream().filter(a->a>0).collect(Collectors.counting())==arr.size()?true:false;
//        System.out.println(bb);
//        System.out.println(arr.stream().allMatch(x->x>0));


        // any number is negative
//        System.out.println(arr.stream().anyMatch(x->x<0));

        // average of list of numbers
//        System.out.println(arr.stream().collect(Collectors.averagingInt(a->a)));
//        System.out.println(arr.stream().mapToInt(a->a).average().getAsDouble());

        // remove duplicates
//        System.out.println(arr.stream().distinct().collect(Collectors.toList()));

        // second highest
//        System.out.println(arr.stream().sorted(Integer::compareTo).skip(arr.size()-2).findFirst().get());

        // Concatenate all strings in a list into a single string.
//        System.out.println(names.stream().reduce("",(s1,s2)->s1+s2+"-"));

//        14. Find the first element in a list that starts with "A".
//        System.out.println(names.stream().filter(s->s.charAt(0)=='A').findFirst().get());


//        15. Sort a list of strings in ascending order.
//        System.out.println(names.stream().sorted(String::compareTo).collect(Collectors.toList()));
//        16. Sort a list of strings in descending order.
//        System.out.println(names.stream().sorted((s1,s2)->-(s1.compareTo(s2))).collect(Collectors.toList()));


        // 17. Find the sum of the squares of all odd numbers in a list.
//        System.out.println(arr.stream().filter(a->a%2!=0).map(x->x*x).mapToInt(x->x).sum());


//        19. Count how many times each word appears in a list of words.
//        System.out.println(names.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())));


//        20. Convert a list of words into a map where the key is the word and the value is its length.
//        System.out.println(names.stream().collect(Collectors.toMap(s->s,String::length)));

//        21. Find the longest word in a list.
//        System.out.println(names.stream().sorted((s1,s2)->-(s1.length()-s2.length())).findFirst().get());


//        21. Find the Shortest word in a list.
//        System.out.println(names.stream().sorted((s1,s2)->(s1.length()-s2.length())).findFirst().get());

//        23. Find all palindrome strings in a list.
//        System.out.println(names.stream().filter(s->{
//            int n=s.length();
//            int i=0,j=n-1;
//            while (i<j) {
//                if (s.charAt(i)!= s.charAt(j))
//                    return false;
//                i++;
//                j--;
//            }
//            return  true;
//        }).collect(Collectors.toList()));

//        System.out.println(names.stream().filter(s->s.equals(new StringBuilder(s).reverse().toString())).collect(Collectors.toList()));

//        24. Convert a list of strings into a comma-separated string.
//        System.out.println(names.stream().reduce("",(a,b)->a+"-"+b));

//        25. Group a list of strings by their first letter.
//        System.out.println(names.stream().collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting())));

//        26. Find the sum of all even numbers in a list of integers.
//        System.out.println(arr.stream().filter(x->x%2==0).mapToInt(x->x).sum());

        //  27. Find the product of all  numbers in a list of integers.
//        System.out.println(arr.stream().mapToLong(x->x).reduce(1,(a,b)->a*b));

//        28. Find the most frequently occurring element in a list.
            // not able to do

//        29.  Find all prime numbers from a given list.
//        System.out.println(arr.stream().filter(a->{
//            for(int i=2;i<Math.sqrt(a);i++){
//                if(a%i==0)
//                    return false;
//            }
//            return true;
//        }).collect(Collectors.toList()));

//        30. Partition a list into two lists: one containing even numbers and the other containing odd numbers.
//        System.out.println(arr.stream().reduce(list1,list2,));
    }

}

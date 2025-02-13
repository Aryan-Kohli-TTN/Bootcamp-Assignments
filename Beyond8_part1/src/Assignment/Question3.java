package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,212,21,21,2,12,4324);
        Set<Integer> set = Set.of(1,212,21,2,12,4324);
        Map<String,Integer> map = Map.of("abc",12,"sjb",45,"7hdbs",34,"ns",43);
        System.out.println(list.getClass()+"  "+list.toString());
        System.out.println(set.getClass()+"  "+set.toString());
        System.out.println(map.getClass()+"  "+map.toString());
    }
}

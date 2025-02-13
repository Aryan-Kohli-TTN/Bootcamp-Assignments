package Assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question7 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> map1 = new LinkedHashMap<Integer,Integer>();
        map1.put(1,10);
        map1.put(2,20);
        map1.put(3,30);
        map1.put(4,40);
        map1.put(5,50);

        System.out.println(map1);
        Map.Entry<Integer,Integer> first1 = map1.firstEntry();
        System.out.println(map1);
        Map.Entry<Integer,Integer> first2 = map1.pollFirstEntry();
        System.out.println(map1);
        Map.Entry<Integer,Integer> last = map1.lastEntry();
        System.out.println(map1);
        Map.Entry<Integer,Integer> last2 = map1.pollLastEntry();
        System.out.println(map1);

        // firstentry and lastEntry will not remove elements
        // while pollFirstEntry and pollLastEntry will remove elements


    }
}

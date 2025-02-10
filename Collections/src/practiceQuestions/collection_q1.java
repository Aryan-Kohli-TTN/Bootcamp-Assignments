package practiceQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class collection_q1 {
    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<Float>();
        arr.add(1.34f);
        arr.add(3.12f);
        arr.add(129.931f);
        arr.add(212.3232f);
        arr.add(12.34f);

        Iterator<Float> it1 = arr.iterator();
        float sum=0;
        while (it1.hasNext()){
            sum+=it1.next();
        }
        System.out.println("Sum is : "+sum);
    }
}

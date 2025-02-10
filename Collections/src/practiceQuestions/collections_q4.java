package practiceQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class EMPLOYEE{
    public String name;
    public String destination;
    public int age;

    EMPLOYEE(String name , String destination, int age){
        this.age=age;
        this.name=name;
        this.destination=destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,destination);
    }

    @Override
    public boolean equals(Object obj) {
        EMPLOYEE emp = (EMPLOYEE) obj;
//        if(obj==null)
        if(this.name.equals(emp.name) && this.age==emp.age && this.destination.equals(emp.destination))
        {
            System.out.println("I AM HERE");
            return true;
        }
        else return false;
    }
}
public class collections_q4 {
    public static void main(String[] args) {
        Map<EMPLOYEE,Integer> mp1 = new HashMap<EMPLOYEE,Integer>();
        // here Integer is the employee salary
        mp1.put(new EMPLOYEE("Aryan","Delhi",22),100000);
        mp1.put(new EMPLOYEE("Anshu","Delhi",21),500000);
        mp1.put(new EMPLOYEE("Aryan","Delhi",22),700000);
        for (EMPLOYEE e : mp1.keySet())
        {
            System.out.println(e.name+" "+e.age+" "+e.destination+" "+mp1.get(e));
        }
    }
}

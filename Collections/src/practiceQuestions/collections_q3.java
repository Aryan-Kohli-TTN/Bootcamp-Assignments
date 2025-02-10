package practiceQuestions;

import java.util.ArrayList;
class SpecialStack{
    public int maxSize;
    public int size;
    public ArrayList<ArrayList<Integer>> arr;
    SpecialStack(int maxSize){
        this.maxSize=maxSize;
        this.size=0;
        arr=new ArrayList<ArrayList<Integer>>();
    }
    public void push(int x){
        if(size<maxSize){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.add(x);
            if(size==0) tmp.add(x);
            else tmp.add(Math.min(x,arr.get(size-1).get(1)));
            arr.add(tmp);
            size++;
//            System.out.println("SIZE IS "+size);
        }
        else throw new RuntimeException("Stack is full");
    }
    public Integer pop(){
        if(size==0)
            throw new RuntimeException("Stack is Empty");
        else
        {
            int x = arr.get(size-1).get(0);
            arr.remove(size-1);
            size--;
            return x;
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size==maxSize;
    }
    public Integer getMin(){
        return arr.get(size-1).get(1);
    }
}
public class collections_q3 {
    public static void main(String[] args) {
        SpecialStack s1 = new SpecialStack(5);
        s1.push(13);
        s1.push(14);
        s1.push(16);
        System.out.println(s1.getMin());
        s1.push(11);
        System.out.println(s1.getMin());
        s1.pop();
        s1.push(3);
        s1.push(34);
        System.out.println(s1.getMin());
    }
}

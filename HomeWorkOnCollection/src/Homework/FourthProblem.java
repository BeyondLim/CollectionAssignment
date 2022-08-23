package Homework;
import java.util.*;
public class FourthProblem {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<Integer>(Set.of(1,2,3,4,5));
        Set<Integer> treeSet2=new TreeSet<>();
        System.out.println("Tree set which we want to clone in the another tree set:"+treeSet);
        for(int element:treeSet){
            treeSet2.add(element);
        }
        System.out.println("Another tree set in which we clone the value of first tree set: "+treeSet2);
    }
}

package Homework;
import java.util.*;
public class FifthProblem {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue1=new PriorityQueue<>(List.of(1,2,3,4,5,6));
        PriorityQueue<Integer> priorityQueue2=new PriorityQueue<>(List.of(1,2,3,4,5,9));
        System.out.println("Two priority queue are as follows:");
        System.out.println(priorityQueue1+"\n"+priorityQueue2);
        for(int element:priorityQueue1){
            boolean bool=priorityQueue2.contains(element);
            System.out.println(bool);
        }
    }
}

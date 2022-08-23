package Homework;
import java.util.*;
public class secondProblem {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListOfInteger=new LinkedList<>(List.of(1,2,3,4,5,6));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two elements wants to enter at first and last into the linked list:");
        int addStart=sc.nextInt();
        int addEnd=sc.nextInt();
        System.out.println("Linked list before the adding the elements: "+linkedListOfInteger);
        linkedListOfInteger.addFirst(addStart);
        linkedListOfInteger.addLast(addEnd);
        System.out.println("Linked List After the addition: "+linkedListOfInteger);
    }
}

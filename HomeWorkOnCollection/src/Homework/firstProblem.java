package Homework;
import java.util.*;
public class firstProblem {
    public static void main(String[] args) {
        ArrayList<Integer> listOfInteger=new ArrayList<Integer>(List.of(1,2,3,4,5,6,7));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index(where you want to update) and element you want to update:");
        int index=sc.nextInt();
        int element=sc.nextInt();
        System.out.println("ArrayList Before update: "+listOfInteger);
        listOfInteger.set(index,element);
        System.out.println("ArrayList after update: "+listOfInteger);

    }
}

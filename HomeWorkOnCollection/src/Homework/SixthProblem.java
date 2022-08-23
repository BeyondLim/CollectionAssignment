package Homework;
import java.util.*;
public class SixthProblem {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<Integer,String>();
        Scanner sc=new Scanner(System.in);
        hashMap.put(2,"Chetan");
        hashMap.put(3,"Yash");
        hashMap.put(4,"kartik");
        hashMap.put(5,"Saurabh");
        System.out.println("Enter the key you want to check:");
        int key=sc.nextInt();
        System.out.println("Check the key is present or not: "+hashMap.containsKey(key));
    }
}

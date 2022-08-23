package Homework;

import java.util.HashSet;
import java.util.Set;

public class ThirdProblem {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>(Set.of(1,2,3,4,5,6));
        System.out.println("Hash Set before conversion to array: "+set);
        int[] arrayOfHashSet=new int[set.size()];
        int i=0;
        for(int element:set){
            arrayOfHashSet[i]=element;
            i++;
        }
        System.out.println("Array After hash set to array conversion: ");
        for (int val:arrayOfHashSet){
            System.out.print(val+" ");
        }
    }
}

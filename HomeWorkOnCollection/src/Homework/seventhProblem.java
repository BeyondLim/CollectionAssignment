package Homework;
import java.util.*;
public class seventhProblem {
    public static void main(String[] args) {
        ZipCodeComparator zipCodeComparator=new ZipCodeComparator();
        TreeMap<Integer,String> treeComparator=new TreeMap<Integer,String>(zipCodeComparator);
        treeComparator.put(223,"Mumbai");
        treeComparator.put(123,"Nagpur");
        treeComparator.put(023,"Pune");
        treeComparator.put(213,"Hydrabad");
        System.out.println("Tree Map before the sorting in descending order:  "+treeComparator);

    }

}

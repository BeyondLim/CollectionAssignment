package Homework;
import java.util.*;
public class ZipCodeComparator implements Comparator<Integer>{
    public int compare(Integer zipCode1,Integer zipCode2){
        if(zipCode1<zipCode2){
            return 1;
        }
        else {
            return -1;
        }
    }

}

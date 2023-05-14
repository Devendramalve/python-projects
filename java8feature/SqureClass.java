package java8feature;

import java.util.Comparator;
import java.util.function.Function;

public class SqureClass {
    public static void main(String[] args) {
        Function<Integer,Integer> f =i->i*i;
        System.out.println("The Squre of 4 is:"+f.apply(40));
        System.out.println("The Squre of 5 is :"+f.apply(50));
    }
    // Comparator

    
}

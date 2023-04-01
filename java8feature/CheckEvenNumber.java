package java8feature;

import java.util.function.Predicate;

public class CheckEvenNumber {
    public static void main(String[] args) {
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(5));
        System.out.println(p.test(6));
    }
}

package StringConcepts;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordToWordStream {
    public static void main(String[] args) {
        String st = "devendra malve from bengaluru";
        String reverseString = Arrays.stream(st.split(" "))
        .map(word -> new StringBuilder(word).reverse())
        .collect(Collectors.joining(" "));
        System.out.println(reverseString);
        
    }
}

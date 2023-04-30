package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordString {
    public static void main(String[] args) {
        String st = "this is devendra malve";
        String[] word = st.split(" ");
        String revString = "";
        for(String w:word){
            StringBuilder stringBuilder = new StringBuilder(w);
            stringBuilder.reverse();
            revString = revString+stringBuilder+" ";
        }
        System.out.println(revString);

    }
}

package StringConcepts;

import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "yogendra patidar from kamodawada looking for new job apportunity";
        String[] words = s.split("//s");
        String reverseWord = " ";
        for(String word:words){
            StringBuilder stringBuilder =  new StringBuilder(word);
            StringBuilder str=stringBuilder.reverse();
            System.out.println(str);
            reverseWord += str+" ";

        }
        System.out.println(reverseWord);
    }
    
}

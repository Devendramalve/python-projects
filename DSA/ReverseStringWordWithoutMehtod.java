package DSA;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWordWithoutMehtod {
    public static void main(String[] args) {
        System.out.println("enter a string:");
        Scanner sc = new Scanner(System.in);
        String revString = " ";
        String str =sc.nextLine();
        // String[] word = str.split(" ");
        for(int i=str.length()-1;i>=0;i--){
           revString = revString+str.charAt(i);
        }
        System.out.println(revString);
        

    }
}

package DSA;

import java.util.Scanner;

public class StringPermutation {
    public static void printPermutation(String str,String emt){
        if(str.length()==0){
            System.out.println(emt);
            // return;
        }
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            String qlpart = str.substring(0, i);
            String qrpart = str.substring(i+1);
            String roq = qlpart+qrpart;
            printPermutation(roq, emt+ch);

        }

    }
    public static void main(String[] args) {
        System.out.println("eneter your String:");
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        printPermutation(str, "");


        
    }
}

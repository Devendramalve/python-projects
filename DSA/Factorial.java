package DSA;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number check is it pailindrom or not:");
        int num = sc.nextInt();
        int temp = 1;
        // int fal =0;
        for(int i=1; i<=num; i++){
            temp = temp*i;
        }
        System.out.println(temp);

    }
}

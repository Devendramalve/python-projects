package ExceptionHandling;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Voting {
    
    public static void main(String[] args)  throws UnderAgeException{
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        if(age<18){
            throw new UnderAgeException();
        }

    }
}

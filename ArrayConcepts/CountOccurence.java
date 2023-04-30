package ArrayConcepts;

import java.util.Scanner;

public class CountOccurence {
    public static int countOccurence(int[]arr,int size,int x){
        int result =0;
        for(int i=0;i<arr.length; i++){
            if(x == arr[i]){
                result++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr ={12,45,789,36,458,21,31,78,88,69,5,46,69,78,69,12,45,69,45};
        int size = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number which you count as a occurence!");
        int x = sc.nextInt();
        System.out.println(countOccurence(arr, size, x));

        
    }
}

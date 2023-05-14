package ArrayConcepts;

import java.util.Arrays;

public class ScondLargest1 {
    public static void main(String[] args) {
        int arr[] = {12,45,78,96,32,45,85,21,20,45,10,48,45,789,456,123,88,25};
        int size = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[size-2]);

    }
}

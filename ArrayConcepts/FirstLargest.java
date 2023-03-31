package ArrayConcepts;

import java.util.Arrays;

public class FirstLargest {
    public static void main(String[] args) {
        int a[]={12,54,78,24,111,45,36,98,85,27};
        int temp =0;
        int size = a.length;
        for(int i =0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[size-1]);
        System.out.println(Arrays.toString(a));
    }
    
}

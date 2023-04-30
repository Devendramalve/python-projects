package ArrayConcepts;

import java.util.Arrays;

public class SortGivenArray {
    public static void main(String[] args) {
        int[] a = {14,56,78,14,100,258,369,789,456,0,34556,1,2,4,5};
        int temp =0;
        for(int i=0; i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp =a[i];
                    a[i] = a[j];
                    a[j]= temp;
                
                }
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
    

}

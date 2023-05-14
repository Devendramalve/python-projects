package ArrayConcepts;

import java.util.HashMap;
import java.util.Map;

public class DublicateElement {
    public static void main(String[] args) {
        int arr[] = {12,45,78,96,32,45,85,21,20,45,10,48,45,789,456,123,88,25};
        int frequency=1;
        int j;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            // for( j=i+1;i<arr.length; j++){
                if(hashMap.containsKey(arr[i])){
                    hashMap.put(arr[i], hashMap.get(arr[i])+1);
                }else{
                    hashMap.put(arr[i], 1);
                }
                // if(arr[i]==arr[j]){
                //     frequency++;
                //     // System.out.println();
                // }
            // }
        }
        System.out.println(hashMap);
        
    }
}

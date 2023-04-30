package DSA;

import java.util.HashMap;
import java.util.Map;

public class IntegerOccurence {
    public static void main(String[] args) {
        int[] arr = {1,25,3,5,6,3,4,78,9,99,87,1,2,45,3,1,2,3,4,56,45};//you have given a array 
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(Integer obj:arr){
            if(!hashMap.containsKey(obj)){
                hashMap.put(obj, );
            }
            hashMap.put(obj,hashMap.get(obj)+1);
        }
        System.out.println(hashMap);

    }
}

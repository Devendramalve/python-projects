package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        int size = nums.length;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0; i<size;i++){
            int restValue = nums[i]-target;
            if(hashMap.containsKey(restValue)){
                return new int[] {hashMap.get(restValue),i};
            }else{
                hashMap.put(nums[i], i);
            }
        }

        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
    
}

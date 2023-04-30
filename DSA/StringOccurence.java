package DSA;

import java.util.HashMap;
import java.util.Map;

public class StringOccurence {
    public static void main(String[] args) {
        String str = "this is yogendra patidar and also devendra malve both are faltu";
        // str.split("");
        char[] charArr = str.toCharArray();
        System.out.println(str);
        HashMap<Character,Integer> hashMap  = new HashMap<>();
        for (char c : charArr) {
            if (hashMap.containsKey(c)) {
 
                // If char is present in charCountMap,
                // incrementing it's count by 1
                hashMap.put(c, hashMap.get(c) + 1);
            }
            else {
 
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap);
    }
}

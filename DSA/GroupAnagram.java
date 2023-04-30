package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static List<List<String>> resultGroupAnagram(String[] sarr){
        Map<String,List<String>> hashMap = new HashMap<>();
        for(String s:sarr){
            System.out.println(s);
            char[] characterArray = s.toCharArray();
            Arrays.sort(characterArray);
            String sorted = new String(characterArray);
            if(!hashMap.containsKey(sorted)){
                hashMap.put(sorted, new LinkedList<>());
            }
                hashMap.get(sorted).add(s);
        
        }
        return new ArrayList(hashMap.values());

    }

    public static void main(String[] args) {
       String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
       List<List<String>> obj = resultGroupAnagram(words);
       System.out.println(obj);
    }
}

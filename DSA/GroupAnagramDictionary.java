package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagramDictionary {
    public static  Map<String,ArrayList<String>> resultGroup(String[] strarray){
        Map<String,ArrayList<String>> hashmap = new HashMap<>();
        for(String word:strarray){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!hashmap.containsKey(sorted)){
                hashmap.put(sorted, new ArrayList<>());
            }
            hashmap.get(sorted).add(word);
            System.out.println(sorted);
        }
        return hashmap;
        
    }
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String,ArrayList<String>> obj = resultGroup(words);
       System.out.println(obj);
    }
}

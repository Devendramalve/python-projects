package StringConcepts;

import javax.naming.ldap.SortControl;

public class StrngVsStringObject {
    public static void main(String[] args) {
        
        String s1 = new String("devendra");
        System.out.println(s1.hashCode());
        String s = "devendra";
        System.out.println(s.hashCode());
        System.out.println(s==s1);//compare address reference
        System.out.println(s.equals(s1));//compare the values
    }
}

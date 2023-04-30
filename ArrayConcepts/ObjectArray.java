package ArrayConcepts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ObjectArray {
    public static void main(String[] args) {
        Object[] arr = new Object[10];
        arr[0]=new Integer(1245);
        arr[1]= new String("Devendra Malve");
        arr[3]= new Double(10.5);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass());
        System.out.println(arr.hashCode());
        System.out.println(arr.length);

    }
    
}

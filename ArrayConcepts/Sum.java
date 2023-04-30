package ArrayConcepts;

public class Sum {
    public static int  sum(int[]a){
        int total =0;
        for(int i=0;i<a.length;i++){
            total  = total+a[i];
        }
        System.out.println(total);
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {12,45,78,96,23,456,74,75};
        int x = sum(arr);
    }
}

package ArrayConcepts;

public class DublicateElement {
    public static void main(String[] args) {
        int arr[] = {12,45,78,96,32,45,85,21,20,30,10,48,79,789,456,123,88,25};
        int frequency=1;
        int j;
        for(int i=0; i<arr.length;i++){
            for( j=i+1;i<arr.length; j++){
                if(arr[i]==arr[j]){
                    // frequency++;
                    System.out.println());
                }
            }
        }
        
    }
}

package interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MarkerInterFaceExample  implements Cloneable{
    
    int productId;
    String productName;
    double productCost;
    public MarkerInterFaceExample(int pid,String pname,double pcost){
        this.productId = pid;
        this.productName = pname;
        this.productCost = pcost;
    }
    public HashMap<Object,Object> showDetails(){
        Map<Object,Object> hashMap = new HashMap<>();
        hashMap.put("productId", this.productId);
        hashMap.put("productName", this.productName);
        hashMap.put("productCost", this.productCost);
        return (HashMap<Object, Object>) hashMap;
    }
    public static void main(String[] args) throws CloneNotSupportedException  {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter product ID: ");  
        int pid = sc.nextInt();  
        System.out.print("Enter product name: ");  
        String pname = sc.next();  
        System.out.print("Enter product Cost: ");  
        double pcost = sc.nextDouble();  
        System.out.println(pcost);
        System.out.println("-------Product Detail--------");  
        MarkerInterFaceExample markerInterFaceExample = new MarkerInterFaceExample(pid, pname, pcost);
        
        System.out.println(markerInterFaceExample.showDetails());
        MarkerInterFaceExample markerInterFaceExample2 = ((MarkerInterFaceExample) markerInterFaceExample.clone());
        System.out.println("after cloning");
        System.out.println(markerInterFaceExample2.showDetails());
    }
    
}

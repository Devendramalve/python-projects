package Threading;

public class OverRiddingRunMethod extends Thread{

    public void run(){
        System.out.println("no args present in run method");
    }
    
    public void run(int i){
        System.out.println("args present in run method");
    }
    public static void main(String[] args) {
        
    }
    
}

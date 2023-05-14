package Threading;

public class JoinMethoOperation extends Thread{
    public void run(){
        for(int i=0; i<=5;i++){
            System.out.println("join thread");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public static void main(String[] args) {
        
    }
}

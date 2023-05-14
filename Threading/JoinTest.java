package Threading;

public class JoinTest {
    public static void main(String[] args) {
        JoinMethoOperation joinMethoOperation = new JoinMethoOperation();
        joinMethoOperation.start();
        try{
            joinMethoOperation.join();
        }catch(InterruptedException e){
            
        }
        
        for(int i=0; i<=5;i++){
            System.out.println("main thread");
        }
    }
}

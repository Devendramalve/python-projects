package Threading;

public class MovieBookApp extends Thread {
    public int total =0;
    public void run(){
        synchronized(this){
            for(int i=0;i<=10;i++){
                total = total+100;
            }
            this.notify();
        }
    }
}

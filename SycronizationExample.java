public class SycronizationExample {
    public synchronized void with(String name){
        for(int i=0; i<=5;i++){
            System.out.println("good morning");
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
        System.out.println(name);
    }
    public static void main(String[] args) {
        
    }
}

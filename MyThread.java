public class MyThread extends Thread{
    SycronizationExample example;
    String name;
    MyThread(SycronizationExample s,String name){
        this.example = s;
        this.name = name;

    }
    public void run(){
        example.with(name);
    }
    public static void main(String[] args) {
        
    }
}

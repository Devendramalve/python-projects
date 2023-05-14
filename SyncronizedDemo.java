public class SyncronizedDemo {
    public static void main(String[] args) {
        SycronizationExample sycronizationExample = new SycronizationExample();
        MyThread myThread = new MyThread(sycronizationExample, "dhoni");
        MyThread myThread2 =  new MyThread(sycronizationExample, "yuvraj");
        myThread.start();
        myThread2.start();
        
    }
}

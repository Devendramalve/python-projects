package Threading;

public class RunStartMethod implements Runnable {
        private String caller;
       
        public RunStartMethod(String caller){
            this.caller = caller;
        }
       
        @Override
        public void run() {
            System.out.println("Caller: "+ caller + " and code on this Thread is executed by : " + Thread.currentThread().getName());
        }
    
    public static void main(String[] args) {
        Thread startThread = new Thread(new RunStartMethod("start"));
        Thread runThread = new Thread(new RunStartMethod("run"));
        startThread.start();;
        runThread.run();
    }
}

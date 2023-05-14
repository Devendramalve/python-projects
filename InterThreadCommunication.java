import Threading.MovieBookApp;

public class InterThreadCommunication {
    public static void main(String[] args)throws InterruptedException {
        MovieBookApp movieBookApp = new MovieBookApp();
        movieBookApp.start();
        synchronized(movieBookApp){
            movieBookApp.wait();
            System.out.println("total earnings"+movieBookApp.total+"rs");

        }
    }
}

package ExceptionHandling;

public class UnderAgeException extends RuntimeException{
    //user define or costomize exception
     UnderAgeException(){
        super("your are under age ");
    }
    
}

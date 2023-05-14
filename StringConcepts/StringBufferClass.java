package StringConcepts;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("Devendra");
        System.out.println(buffer.hashCode());
        buffer.append("malve") ;
        System.out.println(buffer.hashCode());
    }
}

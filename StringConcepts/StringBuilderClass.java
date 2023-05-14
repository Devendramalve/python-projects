package StringConcepts;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder("devendra");
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        sBuilder.append("malve");
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
    }
    
    
}

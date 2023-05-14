package StringConcepts;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtilsUsigReverseWord {
    public static void main(String[] args) {
        String st = "vishwas patidar gram kamodwada main padhare hain atah inka swagat ";
        String reversed = Arrays.stream(st.split(" ")).map(str -> new StringBuffer(str).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversed);
    }
}

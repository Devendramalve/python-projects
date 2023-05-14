package StringConcepts;

public class ReverseWordToWord {
    public static void main(String[] args) {
        String s = "devendra malve from khargone and mehgaon deb";
        String[]  sarr = s.split(" ");
        String output = " ";
        for(String word:sarr){
            String reverseWord = "";
            for(int i=word.length()-1; i>=0; i--){
                reverseWord=  reverseWord+word.charAt(i);    
            }
            System.out.println(reverseWord);
            output = output +reverseWord + " ";
        }
        System.out.println(output);
        
    }
}

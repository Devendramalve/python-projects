package DSA;

public class CheckVowelString {
    public static void checkVowel(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
            str.charAt(i)=='o'||str.charAt(i)=='u'){
                    System.out.println("char is :  "+   str.charAt(i) + "  At Index: "+ i);
                
            }
        }
    }
    public static void main(String[] args) {
        String  str = "devendra malve mehgaon deb andjad dist Barwani";
        checkVowel(str);
    }
}

package DSA;

public class PailindromNumber {
    public static void main(String[] args) {
        int num = 1212;
        int temp =num;
        int rev=0 ,rem;
        while(temp>0){
            rem = temp%10;
            rev= rev*10+rem;
            temp=temp/10;
        

        }
        if(rev==num){
            System.out.println("it's pailindrom number : "+rev);
        }else{
            System.out.println("not a pailindrom number:  "+rev);

        }
    }
}

package objectClass;

import java.util.jar.Attributes.Name;

public class HashCode {
    String sname ;
    int  id;
    HashCode(int id,String sname){
        this.id = id;
        this.sname = sname;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        HashCode hashCode = (HashCode)obj;
        if(this.id == hashCode.id && this.sname == hashCode.sname){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        HashCode hashCode = new HashCode(11, "devendra");
        System.out.println("hashcode  : "+ hashCode + " : "+ hashCode.hashCode());
        HashCode hashCode1 = new HashCode(12, "yogendra");
        System.out.println("hashCode1  :  "+ hashCode1 + " : "+ hashCode1.hashCode());
        HashCode hashCode2 = new HashCode(12, "yogendra");
        System.out.println("hashCode2:  "+ hashCode2 + " : "+ hashCode2.hashCode());
        HashCode hashCode4 = new HashCode(12, "yogendra");
        System.out.println("hashCode2:  "+ hashCode4 + " : "+ hashCode4.hashCode());
        System.out.println(hashCode1.equals(hashCode2));
        System.out.println(hashCode.equals(hashCode4));
    }
}

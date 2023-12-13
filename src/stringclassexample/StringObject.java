package stringclassexample;

public class StringObject {
    public static void main(String[] args) {
        String s1 = "raman";
        String s2= new String("raman");//object always stored in heap memory.
        System.out.println(s1==s2);// == denotes address comparison
        System.out.println(s1.equals(s2));// contain comparison of string
    }
}

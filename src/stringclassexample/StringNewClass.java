package stringclassexample;

public class StringNewClass {
    public static void main(String[] args) {
        String s1="diksha";
        String s2="diksha";

        String s3=new String("tejas,gandhi");
        String s4=new String("tejas,gandhi");

        System.out.println(s1==s2);//address is same deu to same name.as in scp check existence of string and then point out it
        System.out.println(s3==s4);//different address so ans is false

    }//in scp object remain permanent until system crash.
    }//in heap memory create at run time and destroy after finish.


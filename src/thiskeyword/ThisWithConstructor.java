package thiskeyword;

public class ThisWithConstructor {

    ThisWithConstructor() {
        this(100);
        System.out.println("this is your default constructor");

    }
    ThisWithConstructor(int a) {
        this(200,300);
        System.out.println(a);
    }

    ThisWithConstructor(int a,int b) {
        this(400,500,600);
        System.out.println(a);
        System.out.println(b);


    }
    ThisWithConstructor(int a,int b,int c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public static void main(String[] args) {
        ThisWithConstructor thisWithConstructor=new ThisWithConstructor();

    }
    }


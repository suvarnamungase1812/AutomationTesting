package accessmodifiers;
//it is only call inside the pakage not outside the pakage.

public class DefaultExample {


    int a = 876;  //private variable.

    void defaultMethod() {
        System.out.println("This is a default method");
    }

        public static void main (String[]args){
        DefaultExample defaultExample=new DefaultExample();
            System.out.println(defaultExample.a);
            defaultExample.defaultMethod();


        }
    }

package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        String s=null;

        System.out.println("NAMASTE ");
        try{                            //whenever we handle the exception then we have to use try catch block.
            System.out.println(s.length());//thous statement exception throw that are written in try block.
        }
        catch (NullPointerException n){//what exception we get that we have to catch in catch block.
            n.printStackTrace();      // after catch that exception we have to print that exception.with printStackTrace method.
        }
        System.out.println("HOW ARE YOU ALL");
    }
}

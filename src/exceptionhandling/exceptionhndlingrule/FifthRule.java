package exceptionhandling.exceptionhndlingrule;

public class FifthRule {
    public static void main(String[] args) {
        try{
            System.out.println("hi"); // only hi is printing,where is exception occur system will terminate immediately.
            System.out.println(10/0);
            System.out.println("hello");

        }catch (ArithmeticException a){
            a.printStackTrace();
        }
    }
}

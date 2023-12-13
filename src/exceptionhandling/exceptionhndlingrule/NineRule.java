package exceptionhandling.exceptionhndlingrule;

public class NineRule {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }finally {
            System.out.println("namaste");}
    }//we are able to define try block without catch bt we must need to define finally instead of catch block.
}

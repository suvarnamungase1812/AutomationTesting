package exceptionhandling.exceptionhndlingrule;

public class TenthRule {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
    }catch (Exception e){
            e.printStackTrace();
        }finally {//we are able to use finally block with try catch also.
            System.out.println("finally block");
        }
    }
}

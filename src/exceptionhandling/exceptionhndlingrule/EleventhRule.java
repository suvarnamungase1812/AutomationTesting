package exceptionhandling.exceptionhndlingrule;

public class EleventhRule {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally block");//your finally block will execute with an exception.
        }
    }

        }



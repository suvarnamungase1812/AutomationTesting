package exceptionhandling;

public class ThirteenRule {
    public static void main(String[] args) {
        try {
            System.out.println(10/10);
        }finally {
            System.out.println("finally block");//your finally block will execute without catch block also.
        }
    }

}




package exceptionhandling.exceptionhndlingrule;

public class FourteenRule {
    public static void main(String[] args) {
        try {
            System.out.println(10/10);
            System.exit(0);
        }finally {
            System.out.println("finally block");//your finally block will not execute.
        }
    }}




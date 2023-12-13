package exceptionhandling.exceptionhndlingrule;

import java.util.Scanner;

public class TwelfthRule {
    public static void main(String[] args) {
        try {
            System.out.println(10/10);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally block");//your finally block will execute without an exception also.
        }
    }

    public static class ThrowKeyword {//Throw keyword for custom exception.

        public static void voting(int age) {
            if (age > 18) {
                System.out.println("welcome to voting system");
            }else{
                    throw new RuntimeException("user is not able to voting");
                }

            }
            public static void main (String[]args){
                Scanner scanner=new Scanner(System.in);
                System.out.println("enter the your age");
                int candidateAge=scanner.nextInt();
                voting(candidateAge);
            }
        }
}



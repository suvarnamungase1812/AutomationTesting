package exceptionhandling.exceptionhndlingrule;
/*1.we can't use catch block alone.
2.we can define single try & multiple catch block.
3.we can't use multiple try block.
4.we are able to define nested try block.*/
public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            try {
                System.out.println("namaste");
            } catch (NullPointerException n) {
                 n.printStackTrace();
            }
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }
        }
    }


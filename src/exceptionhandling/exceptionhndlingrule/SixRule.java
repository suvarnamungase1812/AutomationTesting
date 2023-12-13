package exceptionhandling.exceptionhndlingrule;

public class SixRule {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
        } catch (Exception e) {//if we don't know which exception we will get at run time then,
            e.printStackTrace();//we have to define direct Exception parent class in catch block
        }
    }
}

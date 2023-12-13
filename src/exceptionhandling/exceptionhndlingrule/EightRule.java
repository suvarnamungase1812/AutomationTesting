package exceptionhandling.exceptionhndlingrule;

public class EightRule {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());

        } catch (ArithmeticException a) {//we can not able to define parent exception at top & child below.
            a.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        }   catch (ArrayIndexOutOfBoundsException  o){
            o.printStackTrace();
         } catch (Exception e) {
        e.printStackTrace();
}}}

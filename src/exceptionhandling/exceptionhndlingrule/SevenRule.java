package exceptionhandling.exceptionhndlingrule;

public class SevenRule {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
       /* } catch (Exception e) {
            e.printStackTrace();
        } catch (ArithmeticException a) {//we can not able to define parent exception at top & child below.
            a.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        }   catch (ArrayIndexOutOfBoundsException  o){
            o.printStackTrace();*/

        } catch (ArithmeticException a) {
            a.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        }   catch (ArrayIndexOutOfBoundsException  o){
            o.printStackTrace();
        }

    }
}


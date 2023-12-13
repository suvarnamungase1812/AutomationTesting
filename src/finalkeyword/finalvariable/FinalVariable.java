package finalkeyword.finalvariable;

public class FinalVariable {
    int a=100;
   final static int b=200;

    FinalVariable(){//you are not able to change final variable value at any cost
        a=500;
    }

    public static void main(String[] args) {
        FinalVariable finalVariable=new FinalVariable();
        System.out.println(finalVariable.a);
        System.out.println(b);
        }

    }


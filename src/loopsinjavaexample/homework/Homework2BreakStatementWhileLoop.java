package loopsinjavaexample.homework;

public class Homework2BreakStatementWhileLoop {
    public static void main(String[] args) {
        int p=50;
        while(p<100)
        {
            System.out.println("value of p is "+p);
        p++;
        if(p>60) {
            break;
        }
        }

    }
}

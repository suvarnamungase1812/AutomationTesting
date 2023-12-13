package loopsinjavaexample;

public class PatternExample1 {
    public static void main(String[] args) {
        for (int i = 5; i >=0 ; i--) {
            {
                System.out.println(" ");//outer loop for row's,
            for (int j = 1; j<=i; j++) {//inner loop for column's.
                System.out.print(" # ");
            }
        }
    }
}}



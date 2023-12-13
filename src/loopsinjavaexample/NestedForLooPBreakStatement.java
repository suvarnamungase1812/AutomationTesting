package loopsinjavaexample;

public class NestedForLooPBreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++)//outer for loop
        {
            for (int j = 0; j < i; j++)//inner for loop
            {
                if (i == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
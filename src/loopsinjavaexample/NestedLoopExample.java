package loopsinjavaexample;

public class NestedLoopExample {

    public static void main(String[] args) {
        for(int i=0;i<4;i++)//outer for loop
        {
            for(int j=0;j<i;j++)//inner for loop
            {
                System.out.println(i+ " "+j);
            }
        }
    }
}

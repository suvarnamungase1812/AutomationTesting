package loopsinjavaexample.homework;

public class SmallestElementFromArray {
    public static void main(String[] args) {
        int[] a = {100, 20, 30, 40, 50, 60};
        int small=a[0];
          for(int i=0;i<=5;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<=5;i++ ) {
            if (small > a[i]) {
                small = a[i];
            }
        }       System.out.println("smallest element from this array is " + small);

    }}



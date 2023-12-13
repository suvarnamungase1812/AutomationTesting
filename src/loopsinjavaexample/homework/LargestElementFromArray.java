package loopsinjavaexample.homework;

public class LargestElementFromArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 400, 50, 60};
        int large=a[0];
        for(int i=0;i<=5;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<=5;i++ ) {
            if (large < a[i]) {
                large = a[i];
            }
        }       System.out.println("largest element from this array is " + large);

    }}



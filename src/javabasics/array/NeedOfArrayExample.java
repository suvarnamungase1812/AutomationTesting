package javabasics.array;

public class NeedOfArrayExample {
    public static void main(String[] args) {
        System.out.println("11");
        System.out.println("21");
        System.out.println("31");
        System.out.println("41");
        System.out.println("51");
        // to reduce the no of line in program we use the array.
        int[] a;//array declaration
        a = new int[5];//array initialization

        a[0] = 1;  //array alwayes start from 0 location.
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for(int i = 0; i < a.length; i++) {//for loop for printing the array element
            System.out.println( a[i]);

        }
    }
}
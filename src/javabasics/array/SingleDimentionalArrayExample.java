package javabasics.array;

public class SingleDimentionalArrayExample {
    public static void main(String[] args) {
        int[] a;//array declaration.
        a = new int[4];//array initialization.
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        //for each format for printing the array
        for(int array :a){
            System.out.println(array);
        }
    }
    }


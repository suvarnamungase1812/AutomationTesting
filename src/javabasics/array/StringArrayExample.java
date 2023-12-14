package javabasics.array;

public class StringArrayExample {
    public static void main(String[] args) {
        String[] stringarray = {"Hello","good","morning","everyone"};
        System.out.println("This is the length of srting = "+  stringarray.length);
        //for(String s:stringarray){
          //  System.out.println(s);
        for(int i=0;i < stringarray.length;i++)
        {
            System.out.println(stringarray[i]);

        }
    }
}
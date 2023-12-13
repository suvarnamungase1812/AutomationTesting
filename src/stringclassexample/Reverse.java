package stringclassexample;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string");
        String s = scanner.nextLine();
        System.out.println("After reverse string is:");
        int i = s.length();
        while (i > 0) {
            i++;
        }
        for ( int j = s.length(); j > 0; j--) {

            System.out.println(j);
        }
    }
}



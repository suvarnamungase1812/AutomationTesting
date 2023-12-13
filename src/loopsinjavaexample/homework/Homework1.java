package loopsinjavaexample.homework;

public class Homework1 {
        public static void main(String[] args) {
            for (int i = 1; i <= 15; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(" " + i + "  This no is divided by 3 and 5");
                } else if (i % 3 == 0) {
                    System.out.println(" " + i + "  This no is divided by 3");
                } else if (i % 5 == 0) {
                    System.out.println(" " + i + "  This no is divided by 5");
                } else {
                    System.out.println(" " + i);
                }
            }
        }
    }




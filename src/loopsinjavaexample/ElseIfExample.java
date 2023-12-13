package loopsinjavaexample;

public class ElseIfExample {
    public static void main(String[] args) {
        int a = 70, b = 20, c = 30, d = 40;
        {
            if (a < b) {//those condition true that statment execute only.
                System.out.println("a is smalle then b");
            } else if (a < c) {
                System.out.println("a is smaller then c");
            } else if (a < d) {
                System.out.println("a is smaller then d");
            } else {
                System.out.println("a is greter varable");


            }
        }
    }}
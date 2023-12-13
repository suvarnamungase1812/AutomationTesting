package javabasics.fundamentals;

public class ClassExample {
    //method
    public void testMethod() {
        System.out.println("Test Method");
    }

 public static int addition(int a,int b) {
     return a + b;
 }
            public static void main(String[] args) {
        ClassExample classExample = new ClassExample();//object
                classExample.testMethod();


                int SUM=ClassExample.addition(100, 200);
                System.out.println(SUM);

    }
}

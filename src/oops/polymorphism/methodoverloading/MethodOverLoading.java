package oops.polymorphism.methodoverloading;

public class MethodOverLoading {
   public void addition(int a, int b) {
       System.out.println(a + b);
   }
    public void addition(int a,int b, int c){
        System.out.println(a+b+c);
    }public void addition(float a, int b){
        System.out.println(a+b);
    }
    //in method over loading same method name but different parameters.
    //it happen only in single class only.change data type also possible.
    //we can not able to chane return type of method.
    public static void staticMethod(int x,int y){
        System.out.println(x+y);
    }//we can overload static method also.
    public static void staticMethod(int x,int y,int z){
        System.out.println(x+y+z);
    }//we can overload main method also.
    public static void main(String[] args) {
        MethodOverLoading methodOverLoading=new MethodOverLoading();
        methodOverLoading.addition(10,20);
        methodOverLoading.addition(30,20,40);
        methodOverLoading.addition(10.4f,20);
        staticMethod(25,25);
        staticMethod(15,25,35);

   }}


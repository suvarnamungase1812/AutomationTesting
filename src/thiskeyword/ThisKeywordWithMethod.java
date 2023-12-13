package thiskeyword;

public class ThisKeywordWithMethod {
    static int a;
    ThisKeywordWithMethod(int a){
        this.a=a;
    }
    public void method1(){
        System.out.println("method1");
        this.method2();
    }
    public void method2(){
        System.out.println("method2");
        this.method3();
    }
    public void method3(){
        System.out.println("method3");
        this.method4();
    }
    public void method4(){
        System.out.println("method4");

    }
    public void method5() {
        System.out.println("static method");
        System.out.println(a);
    }
    public static void main(String[] args) {
ThisKeywordWithMethod thisKeywordWithMethod=new ThisKeywordWithMethod(a=100);
thisKeywordWithMethod.method5();
    }
}

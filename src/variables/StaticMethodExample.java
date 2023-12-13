package variables;

public class StaticMethodExample {
    public void nonStaticMethod(){
        System.out.println("non static method");
    }
    public static void staticMethod() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        StaticMethodExample staticMethodExample=new StaticMethodExample();
        staticMethodExample.nonStaticMethod();
        staticMethod();
        }

    }


package oops.abstraction;

public class ImplementedClassExample extends AbstractExample{
    ImplementedClassExample(int x){
        super( x);
    }
    @Override
    public void abstractMethod() {
        System.out.println("This is an implemented method");
    }

    public static void main(String[] args) {
        ImplementedClassExample implementedClassExample=new ImplementedClassExample(10);
        System.out.println(implementedClassExample.a);
        implementedClassExample.normalMethod();
        implementedClassExample.abstractMethod();
        ImplementedClassExample.staticMethod();
        implementedClassExample.finalMethod();
        ImplementedClassExample implementedClassExample1=new ImplementedClassExample(250);

    }
}

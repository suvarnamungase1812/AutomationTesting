package oops.abstraction.interfaceexample;

public class ImplementedInterface implements InterfaceExample{

    @Override
    public void abstractMethod() {//hare we have to compulsory implement abstract method.
        System.out.println("This is the implemented abstract method");
    }

    public static void main(String[] args) {
        ImplementedInterface implementedInterface=new ImplementedInterface();
        implementedInterface.abstractMethod();
        System.out.println(ImplementedInterface.a);
    }
    }


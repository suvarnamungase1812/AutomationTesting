package oops.abstraction;

public abstract class AbstractExample {//not mandatory abstract method in abstract class as 0-100% abstraction achieve
    int a;//it has instance variable.

    AbstractExample(int y) {//also has constructor.
        System.out.println("This is Abstract class constructor " + y);
    }

        public void normalMethod () {//it has concrete(those have body) method.
            System.out.println("This is normal method");
        }
        public static void staticMethod () {
            System.out.println("This is static method");
        }
        public void finalMethod(){
            System.out.println("This is the final method");
    }
        public abstract void abstractMethod ();//in this abstract method no implementation braces are there.
        //i.e. abstract method does not have any implementation body.


        public static void main (String[]args){//we never ever create the object of abstract class.

        }
    }
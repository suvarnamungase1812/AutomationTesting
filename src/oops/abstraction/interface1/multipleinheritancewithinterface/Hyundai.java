package oops.abstraction.interface1.multipleinheritancewithinterface;

public interface Hyundai {
    void look();
    void color();
    public static void staticMethod(){//we can add static method in interface since java 1.8 version.
        System.out.println("This is the static method of hyundai interface");
    }
default void performance(){
    System.out.println("Performance of Hyundai");
}
private void privateMethod(){//we can able to add private method since java version 1.9
    System.out.println("This is the private method of interface");
}

    public static void main(String[] args) {//we can create main method also.for calling the static method in interface.
        //we can run the interface since version java 1.8
        staticMethod();




    }
}

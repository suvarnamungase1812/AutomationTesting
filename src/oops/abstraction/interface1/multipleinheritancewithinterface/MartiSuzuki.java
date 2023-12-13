package oops.abstraction.interface1.multipleinheritancewithinterface;

public interface MartiSuzuki {
    void color();
    void safety();
    void capacity();
    public static void staticMethod(){//we can add static method in interface since java 1.8 version.
        System.out.println("This is the static method of MartiSuzuki interface");
    }
    default void performance(){
        System.out.println("performance of MartiSuzuki");
    }

}

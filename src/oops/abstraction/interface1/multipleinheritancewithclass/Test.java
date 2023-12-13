package oops.abstraction.interface1.multipleinheritancewithclass;

import oops.abstraction.interface1.multipleinheritancewithinterface.Hyundai;
import oops.abstraction.interface1.multipleinheritancewithinterface.MartiSuzuki;
import oops.abstraction.interface1.multipleinheritancewithinterface.Tata;

public class Test implements Hyundai, MartiSuzuki, Tata {
    @Override
    public void look() {
        System.out.println("very nice");
    }

    @Override
    public void color() {
        System.out.println("white");
    }

    @Override
    public void performance() {//we have to use interface . super keyword for default method call
        Hyundai.super.performance();//default is the feature of java 8.
        Tata.super.performance();
        MartiSuzuki.super.performance();
    }
    @Override
    public void safety() {
        System.out.println("ineradicable");
    }

    @Override
    public void capacity() {
        System.out.println("huge");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.capacity();
        t.color();
        t.performance();
        Hyundai.staticMethod();//we are able to create static method in interface.
        MartiSuzuki.staticMethod();

    }}





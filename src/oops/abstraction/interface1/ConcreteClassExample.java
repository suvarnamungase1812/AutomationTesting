package oops.abstraction.interface1;

public class ConcreteClassExample implements CommonInterface{//for implement select concrete class (alt+enter)
    @Override
    public void season() {
        System.out.println("winter");
    }

    @Override
    public void color() {
        System.out.println("green");
    }

    @Override
    public void test() {
        System.out.println("sweet");
    }

    public static void main(String[] args) {
        ConcreteClassExample c =new ConcreteClassExample();
        c.color();
        c.test();
        c.season();

    }
}

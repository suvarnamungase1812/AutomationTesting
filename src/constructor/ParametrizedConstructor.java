package constructor;

public class ParametrizedConstructor {

    ParametrizedConstructor(int a, int b){//parameterized constructor

        System.out.println("this is the parameterized constructor");
        System.out.println(a);
        System.out.println(b);
}
    public static void main(String[] args) {

ParametrizedConstructor parametrizedConstructor=new ParametrizedConstructor(256 ,890);
ParametrizedConstructor parametrizedConstructor1=new ParametrizedConstructor(700 ,800);

    }
}

package literalsexample.operator.logical;

public class logicalANDExample {
    public static void main(String[] args) {

        System.out.println(20<100 && 20>30);//true && false = false
        System.out.println(10<6 &&60>40 );//false && true  = false
        System.out.println(30<40 && 70>80);//false && false= false
        System.out.println(20<30 && 50>40);//true && true  = true
    }
}

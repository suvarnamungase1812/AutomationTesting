package typecasting;

public class YoungerDaughter extends Mother {

    String cook = "daughter cooking";

    @Override
    public void sanskar() {
        System.out.println("daughter sans-kar");
    }
//upcasting parent class method variable and child class only overriding method call.
        public static void main(String[] args) {
            YoungerDaughter youngerDaughter = new YoungerDaughter();
            Mother mother = new YoungerDaughter();
            System.out.println(mother.cook);
            mother.sanskar();
 //down-casting class name object name = (class name) upcasting object.
            YoungerDaughter youngerDaughter1 = (YoungerDaughter) mother;
            System.out.println(youngerDaughter1.cook);
            youngerDaughter1.sanskar();
//upcasting should be must in down casting.
    }}









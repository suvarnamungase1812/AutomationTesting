package variables;

public class StaticBlockExample {
    static int mn;
    //static block dont have variable name & return type.
    //main use of static block is to initialize static variable.
     static{
         int mn=30;
         System.out.println("this is the static block");
     }

//in static block we dont have to call static block


    public static void main(String[] args) {

    }
}

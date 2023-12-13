package constructor;

public class DefaultConstructorExample {
   DefaultConstructorExample() {//this constructor doesn't have any parameter.

        System.out.println("this is default constructor");
    }


    public static void main(String[] args) {
        DefaultConstructorExample defaultconstructorExample = new DefaultConstructorExample();
        //whenever we create the object of the class our constructor will  call.
    }
}


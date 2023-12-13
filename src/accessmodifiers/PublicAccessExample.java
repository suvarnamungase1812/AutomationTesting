package accessmodifiers;

public class PublicAccessExample {
    //we can access out side class & outside package anywhere.
    public  int a=50;
    public void publicMethod(){
        System.out.println("this is public method");

    }
    public static void main(String[] args) {
        PublicAccessExample publicAccessExample=new PublicAccessExample();
        System.out.println(publicAccessExample.a);
        publicAccessExample.publicMethod();


    }
}

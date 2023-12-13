package accessmodifiers;//this only use within class not out side the class

public class PrivteAccessModifier {
    private int a=675;  //private variable.
    private void privateMethod(){
        System.out.println("This is a private method");
    }
    public static void main(String[] args) {
        PrivteAccessModifier privteAccessModifier=new PrivteAccessModifier();
        System.out.println(privteAccessModifier.a);
        privteAccessModifier.privateMethod();

    }
}

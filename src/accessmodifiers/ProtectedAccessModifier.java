package accessmodifiers;

public class ProtectedAccessModifier {
   protected int a =500;

    protected void protectedMethod() {
        System.out.println(" this is sprotected method");
    }

    public static void main(String[] args) {
        ProtectedAccessModifier protectedAccessModifier=new ProtectedAccessModifier();
        System.out.println(protectedAccessModifier.a);
        protectedAccessModifier.protectedMethod();
    }



}


package oops.polymorphism.methodoverriding;
//son dislike father method he want his own method then overriding is happen.
public class Son extends Father{
    @Override
    public void education() {
        System.out.println("father expectation doctor");
    }

    public static void main(String[] args) {
        Son son=new Son();
        son.education();
    }/*method overriding always happen between parent and child only.
    //static method never ever override in java deu to static keyword couple
    //with class. and in override there are two class parent & child.
    we never ever override  main method deu to main method is static.*/

    }





package oops.encapsulation;

public class ImportanceMainClass {

    public static void main(String[] args) {
       /* GetterExample getterExample = new GetterExample();
        {
            int values = getterExample.getA();
            System.out.println(values);}
            String values=getterExample.getName();
            System.out.println(values);
        }*/
        SetterExample setterExample = new SetterExample();
        setterExample.setX(30);
        setterExample.setCompany("edso services");
        System.out.println(setterExample.getX());
        System.out.println(setterExample.getCompany());


    }}


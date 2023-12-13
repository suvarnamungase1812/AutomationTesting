package variables;

public class OutsideClassExample {
    public static void main(String[] args) {
//outside the class instance variable call we have to creat object then call with object.
        InstanceVariable instanceVariable = new InstanceVariable();
        System.out.println(instanceVariable.a);
//outside the class static variable call we have to use class
        System.out.println(StaticClassExample.x);
        //OUTSIDE THE CLASS  static method call then we have to use classname.method name.
StaticMethodExample.staticMethod();
//outside the class nonstatic method call we have to create object.
        StaticMethodExample staticMethodExample=new StaticMethodExample();
        staticMethodExample.nonStaticMethod();
        }
    }


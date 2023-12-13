package variables;

public class InstanceVariable {
    int a = 100;//instance variable
   /* //public void method(){
    int a = 100; //local variable
    }
*/
    public static void main(String[] args) {
        InstanceVariable instanceVariable = new InstanceVariable();
        System.out.println(instanceVariable.a);
    }

    }

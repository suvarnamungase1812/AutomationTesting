package callby;

public class CallByValue {
    int data;
    public void sum(int a ){
        data=data+50;//only reflect hare
    }
    public static void main(String[] args) {
        CallByValue callByValue=new CallByValue();
        System.out.println("before call by value");
        System.out.println(callByValue.data);

        System.out.println("after call by value");
        callByValue.sum(150);//call by value//not reflect hare
        System.out.println(callByValue.data);

    }
}

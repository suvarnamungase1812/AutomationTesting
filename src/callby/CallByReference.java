package callby;

public class CallByReference {
    int data;
     void sum(CallByReference callByReference){
       callByReference.data=callByReference.data+100;
     }
    public static void main(String[] args) {
         CallByReference callByReference = new CallByReference();
        System.out.println("before call : "+ callByReference.data);
        callByReference.sum(callByReference);
        System.out.println("after call : "+ callByReference.data);
    }
}

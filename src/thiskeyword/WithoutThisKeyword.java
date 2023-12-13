package thiskeyword;

public class WithoutThisKeyword {
    int a,b;
    WithoutThisKeyword(int a,int b){//hare compiler ger ambiguity
        a=a;
        b=b;
    }
    public void show(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        WithoutThisKeyword withoutThisKeyword=new WithoutThisKeyword(10,20);
        withoutThisKeyword.show();


    }
}

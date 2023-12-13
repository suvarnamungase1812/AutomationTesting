package thiskeyword;

public class WithThisKeyword{
int a,b;
    WithThisKeyword(int a,int b){//hare compiler ger ambiguity
        this.a=a;
        this.b=b;
    }
    public void show(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        WithThisKeyword withThisKeyword=new WithThisKeyword(10,20);
        withThisKeyword.show();


    }
}



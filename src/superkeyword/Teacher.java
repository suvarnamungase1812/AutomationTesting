package superkeyword;

public class Teacher {

    Teacher(){
        System.out.println("default constructor");
    }
    Teacher(int x){
        System.out.println(x);
    }
    Teacher(int a,int b){
        System.out.println(a+b);
    }
    int x=30;
    String company="infosys";

    public void education(){
        System.out.println("math");
    }
}

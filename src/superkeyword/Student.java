package superkeyword;

public class Student extends Teacher{
    int x=60;
    String company="tmx";
    Student(){
        super();
    }
    Student(int x){
     super(x);
    }
    public void normalMethod(){
        System.out.println(super.x);
        System.out.println(super.company);
        super.education();
    }
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student.x);
        System.out.println(student.company);
        student.normalMethod();
        Student student1=new Student(250);

    }
}

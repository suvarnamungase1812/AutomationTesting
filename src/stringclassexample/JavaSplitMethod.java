package stringclassexample;

public class JavaSplitMethod {
    public static void main(String[] args) {
        String name = "suvarna Arun Mungase";
        String[] namearray = name.split(" ");//split separately.
        //String[] namearray = name.split("a");//spilt from a
       // String[] namearray = name.split("n");//split from n.
        for (String s : namearray) {
            System.out.println(s);


        }
    }
}
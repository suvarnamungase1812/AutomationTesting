package stringbufferexample;

public class ReverseExampleWithoutMethod {
    public static void main(String[] args) {
        String name = "suhana khan";
        for(int i = name.length()-1; i>=0; i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
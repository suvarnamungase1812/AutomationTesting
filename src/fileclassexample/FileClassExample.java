package fileclassexample;

import java.io.File;
import java.io.IOException;

public class FileClassExample {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Admin\\Desktop\\morning.txt");
        file.createNewFile();
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalFile());
    }
}

package fileclassexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Admin\\Desktop\\morning.txt");
        file.createNewFile();
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("hello everyone good morning");

        fileWriter.flush();
        fileWriter.close();
    }
}

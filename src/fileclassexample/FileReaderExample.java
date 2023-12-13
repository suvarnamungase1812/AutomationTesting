package fileclassexample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Admin\\Desktop\\morning.txt");
        FileReader fileReader=new FileReader(file);
        int i;
        while ((i=fileReader.read())!=-1){
        System.out.print((char)i);
        fileReader.close();
    }
}}

package FileIO;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) throws IOException {
        single();
        mult();
    }
    private static void mult() throws IOException {
        FileReader fr = new FileReader("test.txt");
        char[] cs = new char[1024];
        int len = 0;
        while ((len = fr.read())!=-1){
            System.out.println(cs);
        }
    }

    private static void single() throws IOException {
        FileReader fr = new FileReader("test.txt");
        int len = 0;
        //len = fr.read();
        while ((len = fr.read())!=-1){
            System.out.println((char)len);
        }
    }
}

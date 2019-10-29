package FileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class DemoInPutStream {
    public static void main(String[] args) throws IOException {
        multiByte();
    }
    private static void multiByte() throws IOException {
        FileInputStream fis = new FileInputStream("test1.txt");
        byte[] byt = new byte[2];
        int len = fis.read(byt);
        System.out.println(len);
        System.out.println(Arrays.toString(byt));
        fis.close();
    }

    private static void singleByte() throws IOException {
        FileInputStream fis = new FileInputStream("test1.txt");
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.println(len);
        }
    }
}

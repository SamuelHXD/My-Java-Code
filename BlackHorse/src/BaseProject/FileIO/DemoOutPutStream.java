package BaseProject.FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutPutStream {
    public static void main(String[] args) throws IOException {
        singleByte();
        multiByte();


    }

    private static void multiByte() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("test1.txt"),true);
        byte[] byt = {-65,68,68,69,69};
        fos.write(byt,1,4);
        fos.close();
    }

    private static void singleByte() throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write('h');
        fos.close();
    }
}

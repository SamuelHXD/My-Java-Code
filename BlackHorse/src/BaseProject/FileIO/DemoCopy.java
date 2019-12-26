package BaseProject.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("basic.png");
        FileOutputStream fos = new FileOutputStream("copy.png");
        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b))!= -1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}

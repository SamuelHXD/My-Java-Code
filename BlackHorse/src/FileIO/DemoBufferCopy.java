package FileIO;

import javax.imageio.IIOException;
import java.io.*;

public class DemoBufferCopy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day81_Activiti工作流.zip"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"));
                ){
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read())!=-1){
                bos.write(bytes,0,len);
            }
        } catch (IIOException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time"+(end-start));
    }
}

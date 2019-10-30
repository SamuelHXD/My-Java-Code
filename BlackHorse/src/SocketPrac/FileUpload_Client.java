package SocketPrac;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class FileUpload_Client {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("basic.png"));
        Socket socket = new Socket("localhost",8888);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] b = new byte[1024*8];
        int len;
        while ((len = bis.read(b))!=-1){
            bos.write(b,0,len);
            bos.flush();
        }
        System.out.println("文件发送完毕");
        bos.close();
        socket.close();
        bis.close();
        System.out.println("文件上传完毕");
    }
}

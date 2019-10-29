package SocketPrac;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        Socket client = new Socket("localhost",6666);
        OutputStream os = client.getOutputStream();
        os.write("你好吗?tcp,我来了".getBytes());
        InputStream is = client.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);
        String msg = new String(b,0,len);
        System.out.printf(msg);

        os.close();
        client.close();
    }
}

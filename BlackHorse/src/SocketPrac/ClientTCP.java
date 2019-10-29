package SocketPrac;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        Socket client = new Socket("localhost",6666);
        OutputStream os = client.getOutputStream();
        os.write("你好吗?tcp,我来了".getBytes());
        os.close();
        client.close();
    }
}

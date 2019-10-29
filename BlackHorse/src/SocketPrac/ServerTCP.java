package SocketPrac;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动,等待连接...");
        ServerSocket ss = new ServerSocket(6666);
        Socket server = ss.accept();
        InputStream is = server.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);
        String msg = new String(b,0,len);
        System.out.println(msg);
        OutputStream out = server.getOutputStream();
        out.write("我很好,谢谢你".getBytes());
        out.close();
        is.close();
        server.close();
    }
}

package SocketPrac;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BsServers {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes))!=-1){
            System.out.println(Arrays.toString(bytes));
        }
        ArrayList<String> list = new ArrayList<>();
        list.stream();
        Set<Integer> set = new HashSet<>();
        list.stream();
    }
}

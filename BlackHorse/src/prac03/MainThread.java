package prac03;

import java.util.MissingFormatArgumentException;

public class MainThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }
    }
}

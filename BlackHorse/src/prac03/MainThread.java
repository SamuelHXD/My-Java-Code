package prac03;

import java.util.MissingFormatArgumentException;

public class MainThread extends Thread{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread);

    }
}

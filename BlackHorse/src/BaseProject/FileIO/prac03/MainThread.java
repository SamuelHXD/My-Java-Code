package BaseProject.FileIO.prac03;

public class MainThread extends Thread{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread);

    }
}

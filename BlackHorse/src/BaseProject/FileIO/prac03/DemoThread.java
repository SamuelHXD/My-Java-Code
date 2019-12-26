package BaseProject.FileIO.prac03;

public class DemoThread {
    public static void main(String[] args) {
        MainThread mt = new MainThread();
        mt.start();
        new MainThread().start();
    }
}

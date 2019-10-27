package prac03;

public class DemoThread {
    public static void main(String[] args) {
        MainThread mt = new MainThread();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}

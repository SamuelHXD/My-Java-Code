package BaseProject.FileIO.prac03;

public class DemoImplRunnable {
    public static void main(String[] args) {
        DemoRunable run = new DemoRunable();
        Thread t = new Thread(run);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}

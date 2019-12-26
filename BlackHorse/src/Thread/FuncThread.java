package Thread;

public class FuncThread {
    public static void main(String[] args) {
        Thread thr1 = new Thread(()-> System.out.println(Thread.currentThread().getName()));
        thr1.start();
        System.out.println(Thread.currentThread().getName());
    }

}

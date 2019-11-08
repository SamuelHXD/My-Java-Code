package Thread;

public class Demo01Thread {
    public static void main(String[] args) {
//        Mythread mythread = new Mythread();
//        Mythread mythread1 = new Mythread();
//        System.out.println("s");
//        mythread.start();
//        mythread1.start();
        MyThreadImp myThreadImp = new MyThreadImp();
        Thread thread1 = new Thread(myThreadImp);
        thread1.start();
        System.out.println(Thread.currentThread().getName());
    }
}

package Thread;

public class Mythread extends Thread{
    @Override
    public void run(){
        System.out.println("线程名:"+getName()+"线程id"+getId());
    }
}

package Thread;

import org.omg.CORBA.Current;

public class MyThreadImp implements Runnable{
    @Override
    public void run(){
        System.out.println("线程名"+ Thread.currentThread().getName()+"线程id:"+Thread.currentThread().getId());
    }
}

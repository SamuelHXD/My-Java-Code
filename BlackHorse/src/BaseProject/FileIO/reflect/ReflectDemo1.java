package BaseProject.FileIO.reflect;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import BaseProject.FileIO.prac00.Student;

//获取class的三种方式

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("BaseProject.FileIO.prac00.Student");
        System.out.println(cls);
        Class s = Student.class;
       // Class<? extends Student> aClass = s.getClass();
        //System.out.println(aClass);
        System.out.println(s);
    }
    @Before
    public void before(){
        System.out.println("init...");
    }

    @After
    public void after(){

        System.out.println("end...");
    }

    @Test
    public void TestAdd(){
        System.out.println("我被测试了");
    }
}


package prac03;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void demo02() {
        Date date = new Date(454654646546L);
        System.out.println(date);
    }

    public static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }
}

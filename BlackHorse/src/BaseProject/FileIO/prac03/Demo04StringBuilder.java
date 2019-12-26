package BaseProject.FileIO.prac03;

public class Demo04StringBuilder {
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);
        StringBuilder bu = new StringBuilder();
        StringBuilder bu3 = bu.append("abv");
        System.out.println(bu);
        System.out.println(bu3);
        System.out.println(bu==bu3);
    }
}

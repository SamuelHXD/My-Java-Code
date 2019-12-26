package BaseProject.FileIO;

import java.io.File;

public class Demo1File {
    public static void main(String[] args) {
        show05();
    }

    private static void show05() {
        File f4 = new File("C:\\Users\\DELL\\Desktop\\My-Java-Code");
        File[] files = f4.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    private static void show04() {
        File f4 = new File("C:\\Users\\DELL\\Desktop\\My-Java-Code");
        String[] list = f4.list();
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent,"heleo.txt");
        System.out.println(file);
    }

    private static void show02(String parent, String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    private static void show01() {
        File f1 = new File("a.txt");
        boolean mkdir = f1.delete();
        File absoluteFile = f1.getAbsoluteFile();
        System.out.println(absoluteFile);
        System.out.println(mkdir);
    }
}

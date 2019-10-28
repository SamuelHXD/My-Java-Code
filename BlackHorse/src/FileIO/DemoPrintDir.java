package FileIO;

import java.io.File;

public class DemoPrintDir {
    public static void main(String[] args) {
        File Dir = new File("C:\\Users\\DELL\\Desktop\\My-Java-Code");
        printDire(Dir);

    }

    private static void printDire(File filepath) {
        File f1 = filepath;
        File[] list = f1.listFiles();
        for (File file : list) {
            if (file.isDirectory()){
                printDire(file);
            }
            else
            {
                System.out.println("fileName:"+file);
            }
        }
    }
}

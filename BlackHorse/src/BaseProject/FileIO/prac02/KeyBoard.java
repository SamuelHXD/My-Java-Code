package BaseProject.FileIO.prac02;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘开启!");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭!");
    }

    public void type(){
        System.out.println("键盘打字!");
    }
}

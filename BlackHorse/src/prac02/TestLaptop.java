package prac02;

public class TestLaptop {
    public static void main(String[] args) {
        Laptop kp = new Laptop();
        kp.open();
        USB u = new Mouse();
        kp.useUsb(u);
        USB k = new KeyBoard();
        kp.useUsb(k);
        kp.close();
    }
}

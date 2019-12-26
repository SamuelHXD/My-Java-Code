package BaseProject.FileIO.prac01;

public class MyInterface {
    public static void main(String[] args) {
        InterfaceA obj = new InterfaceA() {
            @Override
            public void method() {
                System.out.println("ss");
            }

            @Override
            public void methodA() {
                System.out.println("bb");
            }
        };
        obj.method();
        obj.methodA();
    }
}

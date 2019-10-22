package prac01;

public class InterfaceMy implements InterfaceA,InterfaceB {

    @Override
    public void method() {
        System.out.println("字方法");
    }

    @Override
    public void methodB() {
        System.out.println("方法A ");
    }

    @Override
    public void methodA() {
        System.out.println("方法B");
    }
}

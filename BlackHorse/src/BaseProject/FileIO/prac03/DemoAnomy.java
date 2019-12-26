package BaseProject.FileIO.prac03;

public class DemoAnomy {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }

        new Thread(()-> System.out.println("Thread1:")).start();


        new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Thread:"+i);
                }

            }
        }).start();

    }
}

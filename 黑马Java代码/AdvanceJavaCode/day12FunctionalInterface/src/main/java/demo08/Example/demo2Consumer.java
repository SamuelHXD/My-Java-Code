package demo08.Example;

import java.util.function.Consumer;

public class demo2Consumer {
    public static void main(String[] args){
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
        printMessage(array,(String arr)->{
                String name = arr.split(",")[0];
                System.out.println(name);

        },(String arr)->{

                String sex = arr.split(",")[1];
                System.out.println(sex);

        });
    }

    public static void printMessage(String[] message,Consumer<String> consumer1,Consumer<String> consumer2){
        for (String str:message)
            consumer1.andThen(consumer2).accept(str);
    }
}

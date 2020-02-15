package demo08.Example;

import java.util.ArrayList;
import java.util.function.Supplier;

public class demo01 {


    public static void main(String[] args) {
        int arr[] = {1,4,4,5,2};
        int max = getMax(()->{
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]>temp){
                    temp = arr[i];
                }
            }
            return temp;
        });
        System.out.println(max);
    }
    public static Integer getMax(Supplier<Integer> sup){
        return sup.get();
    }

}

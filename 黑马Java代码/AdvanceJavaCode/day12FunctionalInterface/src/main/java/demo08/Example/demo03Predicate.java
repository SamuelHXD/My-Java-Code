package demo08.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class demo03Predicate {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> list = filter(array,(s) ->
            s.split(",")[1].equals("女")
        ,
                (s) ->
            s.split(",")[0].length()==4
        );
        System.out.println(list);
    }

    public static List<String> filter(String[] array, Predicate<String> predicate1, Predicate<String> predicate2){
        List<String> list = new ArrayList<>();
        for (String arr: array){
            if (predicate1.and(predicate2).test(arr)){
                list.add(arr);
            }
        }
        return list;
    }
}

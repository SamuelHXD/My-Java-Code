package demo08.Example;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

public class demo04Function {
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        Integer change = change(str,
                (s)-> s.split(",")[1],
                (s)-> Integer.parseInt(s),
                (s)-> s += 100);
        System.out.println(change);
    }


    public static Integer change(String str, Function<String,String> fun1, Function<String,Integer> fun2, Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }
}

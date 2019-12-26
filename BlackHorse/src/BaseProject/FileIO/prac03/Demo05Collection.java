package BaseProject.FileIO.prac03;

import java.util.ArrayList;
import java.util.Collection;

public class Demo05Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);
        boolean b1 = coll.add("zhangsan");
        System.out.println(b1);
        System.out.println(coll);
        coll.add("lisi");
        coll.add("tiwu");
        System.out.println(coll);
        coll.remove("zhangsan");
        System.out.println(coll);
        boolean b2 = coll.contains("lisi");
        System.out.println(b2);
    }
}

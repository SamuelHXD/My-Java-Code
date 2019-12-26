package BaseProject.FileIO.prac04;

import java.util.ArrayList;

public class Card {
    String[] color = new String[]{"♥","♦","♠","♣"};
    String[] dianshu = {"2","A","k","Q","j","10","9","8","7","6","5","4","3"};
    String[] daxiaowang = {"dawan","xiaowang"};
    ArrayList<String> paizu = new ArrayList<>();
    void getArrayPai(){
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < dianshu.length; j++) {
                paizu.add(color[i]+dianshu[j]);
            }
        }
        for (int i = 0; i < daxiaowang.length; i++) {
            paizu.add(daxiaowang[i]);
        }
    }

}

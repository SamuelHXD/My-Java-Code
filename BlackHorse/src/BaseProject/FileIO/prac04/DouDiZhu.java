package BaseProject.FileIO.prac04;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> people1 = new ArrayList<>();
        ArrayList<String> people2 = new ArrayList<>();
        ArrayList<String> people3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        Card card = new Card();
        card.getArrayPai();
        System.out.println(card.paizu);
        Collections.shuffle(card.paizu);
        ArrayList<String> poker = card.paizu;
        for (int i = 0; i < poker.size(); i++) {
            System.out.println(poker.size());
            if (i>=51){
                dipai.add(poker.get(i));
            }else if (i%3==0){
                people1.add(poker.get(i));
            }else if(i%3==1) {
                people2.add(poker.get(i));
            }else if (i%3 == 2){
                people3.add(poker.get(i));
            }
            }
        Collections.sort(people1);
        Collections.sort(people2);
        Collections.sort(people3);
        System.out.println(people1);
        System.out.println(people2);
        System.out.println(people3);
        System.out.println(dipai);

        }

}

package lecture05;

import java.util.ArrayList;

public class Exercise5_7 {
    public static void main(String[] args) {
        ArrayList<Insect> insectList = new ArrayList<>();

        insectList.add(new Insect());
        insectList.add(new Butterfly());
        insectList.add(new Locust());
        insectList.add(new SwallowtailButterfly());

        for(Insect ins : insectList){
            ins.move();
        }
    }
}

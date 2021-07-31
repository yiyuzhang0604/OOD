package problem3;
import problem2.Swimmer;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        List<Swimmer> swimmers = new ArrayList<>();
        List<Double> butterfly = new ArrayList<>();
        List<Double> back = new ArrayList<>();
        List<Double> breast = new ArrayList<>();
        List<Double> free = new ArrayList<>();
        butterfly.add(20.0);
        back.add(30.0);
        breast.add(40.0);
        free.add(30.0);
        free.add(40.0);
        List<Double> butterfly2 = new ArrayList<>();
        butterfly2.add(30.0);
        butterfly2.add(40.0);
        Swimmer sw1 = new Swimmer("Yellow", butterfly, back, breast, free);
        Swimmer sw2 = new Swimmer("Red", butterfly2, back, breast, free);
        swimmers.add(sw1);
        swimmers.add(sw2);


    }
}

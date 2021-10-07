package java13.demo6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kaunas");
        list.add("Vilnius");
        list.add("Kaunas");
        list.add("Alytus");
        list.add("Klaipėda");
        list.add("Vilnius");
        list.add("Kaunas");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();

            if (s.equals("Vilnius")) {
                iterator.remove();
            }
        }
        System.out.println(list);

        System.out.println("-------------------------------");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Kaunas")) {
                list.remove(i);
            }
        }

        System.out.println(list);


        for(String miestas: list) {
            if (miestas.equals("Alytus")) {
                list.remove(miestas);
            }
        }

        System.out.println(list);
    }

}

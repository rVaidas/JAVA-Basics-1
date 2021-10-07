package java13.uzd1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Zmogus> zodynas = new HashMap<>();
        zodynas.put("9",new Zmogus("Andrius", "Petras", "3"));
        zodynas.put("1",new Zmogus("Jonas", "Petras", "1"));
        zodynas.put("4",new Zmogus("Darius", "Petras", "4"));
        zodynas.put("3",new Zmogus("Andrius", "Petras", "3"));
        zodynas.put("1",new Zmogus("Jonas", "Petras", "1"));
        zodynas.put("2",new Zmogus("Jonas", "Petras", "2"));
        zodynas.put("5",new Zmogus("Andrius", "Petras", "5"));
        zodynas.put("1",new Zmogus("Jonas", "Petras", "1"));
        zodynas.put("2",new Zmogus("Darius", "Petras", "2"));

        System.out.println(zodynas);

        TreeMap<String, Zmogus> treeZodynas = new TreeMap<>(zodynas);
        System.out.println(treeZodynas);

        for(String raktas: treeZodynas.keySet()) {
            System.out.println(raktas);
        }

        for(Zmogus obj: treeZodynas.values()) {
            System.out.println(obj);
        }
    }
}

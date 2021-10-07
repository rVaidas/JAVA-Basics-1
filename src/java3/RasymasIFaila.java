package java3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RasymasIFaila {
    public static void main(String[] args) {
        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter("src/java3/ITeksta.txt"));

            bf.write("Labas vakaras");
            bf.close();

        } catch (IOException ex) {
            System.out.println("Nepavyko irasyti i faila");
        }
    }
}

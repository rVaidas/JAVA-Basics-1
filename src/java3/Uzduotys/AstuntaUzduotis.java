package java3.Uzduotys;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AstuntaUzduotis {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader ( new FileReader("src/java3/uzduotys/Astuntas.txt"));
            int suma = 0;
            int kiekis = 0;
            String eilute = br.readLine();
            while (eilute != null) {
                System.out.println(eilute);
                suma = Integer.parseInt(eilute);
                kiekis = kiekis + 1;
                eilute = br.readLine(); //sita turi buti paskutineje eilute3 while ciklo
            }
            double vidurkis = suma / kiekis;
            System.out.println("Suma = " + suma);
            System.out.println("Vidurkis = " + vidurkis);

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
    }
}

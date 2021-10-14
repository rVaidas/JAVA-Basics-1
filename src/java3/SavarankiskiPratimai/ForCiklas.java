package java3.SavarankiskiPratimai;

import java.io.*;


public class ForCiklas {
    public static void main(String[] args) {
        //išrašyti skaičių 20 nuo 1 iki 20 vis į naują eilutę, rezultatą išspausdinti į failą
        BufferedWriter saslykas = null;
        try {
            saslykas = new BufferedWriter(new FileWriter("src/java3/SavarankiskiPratimai/sForCiklas.txt"));
            for (int i = 1; i <= 20; i++) {
                System.out.println(i);
                saslykas.write(""+i);
                saslykas.newLine(); //israso viska ne is eiles o sudeda vis i nauja eilute
            }
            saslykas.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
    }
}

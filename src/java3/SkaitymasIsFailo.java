package java3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class SkaitymasIsFailo {
    public static void main(String[] args) {
        URL url = SkaitymasIsFailo.class.getResource( "tekstas.txt");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(url.getPath()));

String line = br.readLine();
while(line != null) {
    System.out.println(line);
    line = br.readLine();
}

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Netiketa klaida");
        }
    }
}

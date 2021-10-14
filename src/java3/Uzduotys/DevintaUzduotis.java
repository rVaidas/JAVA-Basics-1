package java3.Uzduotys;

import java.io.*;

public class DevintaUzduotis {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("src/java3/uzduotys/Devintas.txt"));
            bw = new BufferedWriter(new FileWriter("src/java3/uzduotys/DevintasAtsakymai.txt"));

            String eilute = br.readLine();
            while (eilute != null) {
//                System.out.println(eilute); //uzrasem pastikrinti ar veikia, siaip nereikalinga
                int skaicius = Integer.parseInt(eilute);
                if (skaicius % 2 == 0) {
                    System.out.println(skaicius + " - lyginis");
                    bw.write(skaicius + " - lyginis");
                    bw.newLine();
                } else {
                    System.out.println(skaicius + " - nelyginis");
                    bw.write(skaicius + " - nelyginis");
                    bw.newLine(); //sudeda faile nei iseiles, o vis i nauja eilute
                }

                eilute = br.readLine();
            }
            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
    }
}

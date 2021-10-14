package Java4.uzduotys4;

import java.io.*;
import java.util.Arrays;

public class Uzduotys {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        int[] masyvas = new int[0];
        int[] didesniSkaiciaiUzVidurki = new int[0];
        int[] neigiamiSkaiciai = new int[0]; //i sita masyva desime neigiamus skaicius
        int[] pasikartojantysSkaiciai = new int[0];
        int[] surikiuotasMasyvas = new int[0];

        try {
            br = new BufferedReader(new FileReader("src/java4/uzduotys4/duomenys.txt"));
            String line = br.readLine();
            while (line != null) {
                int skaicius = Integer.parseInt(line);
                masyvas = pridetiElementa(masyvas, skaicius);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }

//        Skaiciavimu vieta

        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma = suma + masyvas[i];
        }

        double vidurkis = 1.0 * suma / masyvas.length; //(1.0 reikia todel, kad masyvas ir length yra sveiki skaiciai, todel juos reikia pavesri i double)

        int minIndeksas = 0;
        int maxIndeksas = 0;
        for (int i = 1; i < masyvas.length; i++) {
            if (masyvas[minIndeksas] > masyvas[i]) {
                minIndeksas = i;
            }                                      //sitie abu ifai priklauso tam paciam for
            if (masyvas[maxIndeksas] < masyvas[i]) {
                maxIndeksas = i;
            }
        }

        for (int i = 0; i < masyvas.length; i++) {
            if (vidurkis < masyvas[i]) {
                didesniSkaiciaiUzVidurki = pridetiElementa(didesniSkaiciaiUzVidurki, masyvas[i]);
            }

            if (masyvas[i] < 0) {
                neigiamiSkaiciai = pridetiElementa(neigiamiSkaiciai, masyvas[i]);
            }
        }


        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] == masyvas[j]) {
                    pasikartojantysSkaiciai = pridetiElementa(pasikartojantysSkaiciai, masyvas[i]);
                    break;
                }
            }
        }


        int antrasMinIndeksas = 0;
        int antrasMaxIndeksas = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > masyvas[minIndeksas] &&
                    masyvas[i] < masyvas[antrasMinIndeksas]) {
                antrasMinIndeksas = i;
            }
            if (masyvas[i] < masyvas[maxIndeksas] &&
                    masyvas[i] > masyvas[antrasMaxIndeksas]) {
                antrasMaxIndeksas = i;
            }
        }


        boolean arEgzistuojaTrys = false;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] == 3) {
                arEgzistuojaTrys = true;
                break;
            }
        }

        surikiuotasMasyvas = Arrays.copyOf(masyvas, masyvas.length);

        int laikinas;
        for (int i = 0; i < surikiuotasMasyvas.length; i++) {

            for (int j = 1; j < surikiuotasMasyvas.length - i; j++) {
                if (surikiuotasMasyvas[j - 1] > surikiuotasMasyvas[j]) {
                    laikinas = surikiuotasMasyvas[j - 1];
                    surikiuotasMasyvas[j - 1] = surikiuotasMasyvas[j];
                    surikiuotasMasyvas[j] = laikinas;
                }
            }
        }


        try {
            bw = new BufferedWriter(new FileWriter("src/java4/uzduotys4/atsakymai.txt"));
            bw.write("Nuskaityti duomenys");
            bw.newLine();
            for (int i = 0; i < masyvas.length; i++) {
                bw.write(masyvas[i] + " ");
            }
//            apsukti masyva
            bw.newLine();
            bw.write("1. Apsuktas masyvas: ");
            bw.newLine();
            for (int i = masyvas.length - 1; i >= 0; i--) {
                bw.write(masyvas[i] + " ");
            }

//            suma ir vidrukis
            bw.newLine();
            bw.write("2. Suma ir vidurkis: ");
            bw.newLine();
            bw.write("Suma = " + suma);

            bw.newLine();
            bw.write("Vidurkis = " + vidurkis);
            bw.newLine();
            bw.write("3. Min ir Max: ");
            bw.newLine();
            bw.write("Min = " + masyvas[minIndeksas]);
            bw.newLine();
            bw.write("Max = " + masyvas[maxIndeksas]);

            bw.newLine();
            bw.write("4. Reiksmes didesnes uz vidurki: ");
            bw.newLine();
            for (int i = 0; i < didesniSkaiciaiUzVidurki.length; i++) {
                bw.write(didesniSkaiciaiUzVidurki[i] + " ");
            }

            bw.newLine();
            bw.write("5. Neigiami skaiciai: ");
            bw.newLine();
            for (int i = 0; i < neigiamiSkaiciai.length; i++) {
                bw.write(neigiamiSkaiciai[i] + " ");
            }

            bw.newLine();
            bw.write("6. Pasikartojantys skaiciai: ");
            bw.newLine();
            for (int i = 0; i < pasikartojantysSkaiciai.length; i++) {
                bw.write(pasikartojantysSkaiciai[i] + " ");
            }

            bw.newLine();
            bw.write("7. Antra maziausia reiksme:");
            bw.newLine();
            bw.write("Antra maziausia reiksme = " + masyvas[antrasMinIndeksas]);

            bw.newLine();
            bw.write("8. Antra didziausia reiksme:");
            bw.newLine();
            bw.write("Antra didziausia reiksme = " + masyvas[antrasMaxIndeksas]);
            bw.newLine();

            bw.write("9. Ar egzistuoja skaicius 3 ?");
            bw.newLine();
            if (arEgzistuojaTrys) {
                bw.write("Taip");
            } else {
                bw.write("Ne");
            }

            bw.newLine();
            bw.write("10. Isrikiuoti skaičiai: ");
for(int i = 0; i < surikiuotasMasyvas.length; i++) {
    bw.write(surikiuotasMasyvas[i] + " ");
}

            bw.close();
        } catch (IOException e) {
            System.out.println("Kazkas netiketo rasyme");
        }

    }

    static int[] pridetiElementa(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }
}

package Java4;

public class MasyvoElementoPridejimas {
    public static void main(String[] args) {
        int[] a = { 1, 2, 6};
        a = iterptiElementa(a, 3, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    static int[] iterptiElementa(int[] masyvas, int reiksme, int vieta) {
        int[] laikinas = new int[masyvas.length + 1];
        int pridejimoVieta = 0;

        for(int i = 0; i < masyvas.length; i++) {
            if (i == vieta) {
                laikinas[pridejimoVieta] = reiksme;
                pridejimoVieta = pridejimoVieta + 1;
            }
            laikinas[pridejimoVieta] = masyvas[i];
            pridejimoVieta = pridejimoVieta + 1;
        }
        return laikinas;
    }
}

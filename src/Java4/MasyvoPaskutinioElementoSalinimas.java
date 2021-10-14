package Java4;

import java.util.Arrays;

public class MasyvoPaskutinioElementoSalinimas {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};



    }

    static int[] paskutinioElementoSalinimas(int[] masyvas) {
        return Arrays.copyOf(masyvas, masyvas.length - 1);
    }
}

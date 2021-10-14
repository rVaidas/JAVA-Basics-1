package Java5.uzduotys5;

import java.util.Arrays;

public class septintaUzduotis {
    public static void main(String[] args) {
        int[] array = {2, 3, 7, 10, 15, 4, 12};
        int[] smallerThanTen = smallerNumbersThanTen(array);
        spausdintiMasyva(smallerThanTen, "Skaiciai mazesni uz 10");

        int[] smallerThanTen2 = smallerNumbersThan(array, 10);
        spausdintiMasyva(smallerThanTen, "Skaiciai mazesni uz 10 antras");

        int[] smallerThanTen3 = smallerNumbersThan(array, 7);
        spausdintiMasyva(smallerThanTen, "Skaiciai mazesni uz 7 ");

    }


    static int[] smallerNumbersThan(int[] array, int number) {
        int[] smallerThan = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) {
                smallerThan = addElement(smallerThan, array[i]);
            }
        }
        return smallerThan;
    }

    static int[] smallerNumbersThanTen(int[] array) {
        int[] smallerThanTen = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                smallerThanTen = addElement(smallerThanTen, array[i]);
            }
        }
        return smallerThanTen;
    }

    static int[] addElement(int[] array, int value) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;
        return array;
    }

    static void spausdintiMasyva(int[] spausdinamasMasyvas, String tekstas) {
        System.out.println(tekstas);
        for (int i = 0; i < spausdinamasMasyvas.length; i++) {
            System.out.println(spausdinamasMasyvas[i]);

        }
    }
}

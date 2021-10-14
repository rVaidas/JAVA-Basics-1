package Java5.uzduotys5;

public class astuntaUzduotis {
    public static void main(String[] args) {
        int[] array = {-1, 2, 99, 12, 15, 10};

    }


    static void sortAscending(int[] array) {
        int tmp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }

        }
    }
}

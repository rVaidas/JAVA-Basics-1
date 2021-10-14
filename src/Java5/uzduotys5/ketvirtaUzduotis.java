package Java5.uzduotys5;

public class ketvirtaUzduotis {
    public static void main(String[] args) {
        double[] array = {2d, 3.5, 99d, -13d}; // 2d tas pats kaip 2.0
        System.out.println("Average " + average(array));

    }


    static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // tas pats kaip sum = sum + array[i]
        }
        return sum;
    }

    static double average(double[] array) {
        double sum = sum(array); //kintamasis lygu metodui
        return sum / array.length;
//        return sum(array) / array.length;  galima viena eilute tokia, arba tokias kaip dvi auksciau

    }
}

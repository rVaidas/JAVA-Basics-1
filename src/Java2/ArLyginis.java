package Java2;

import java.util.Scanner;

public class ArLyginis {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        double skaicius = reader.nextDouble();
        reader.close();

        if (skaicius % 2 == 0) {
            System.out.println("Skaicius yra lyginis");
        } else {
            System.out.println("Skaicius yra nelyginis");
        }
    }
}

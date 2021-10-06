package Java2;

import java.util.Scanner;

public class SkaitymasIsEkrano {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int skaicius = reader.nextInt();
        System.out.println("Iveskite nesveika skaiciu");
        reader.close();
    }
}

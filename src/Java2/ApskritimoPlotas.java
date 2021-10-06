package Java2;

import java.util.Scanner;

public class ApskritimoPlotas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite spinduli r");
        double r = reader.nextDouble();
        reader.close();

        double perimetras = 2 * Math.PI * r;

        double plotas = Math.PI * r * r; //Math.pow(r, 2) kelia kvadratu

        System.out.println("Perimetras = " + String.format("%.2f", perimetras)); //%.2f nurodo kiek skaiciu isvesti po kablelio
        System.out.println("Plotas = " +String.format("%.3f", plotas));
    }
}

package Java5.uzduotys5;

public class treciaUzduotis {
    public static void main(String[] args) {
        arLyginis(3);
        arLyginis(2);
    }


    static void arLyginis(int skaicius) {
        System.out.print("Skaicius " + skaicius + " yra "); // su ln gaunasi kaip enteriu, o be ln kaip be enterio
        if(skaicius % 2 == 0) {
            System.out.println("Lyginis");
        } else {
            System.out.println("Nelyginis");
        }
    }
}

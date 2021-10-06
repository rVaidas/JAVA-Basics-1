package Java2;

public class Veriables {
    public static void main(String[] args) {
        boolean buljonas = true;
        System.out.println("Reiksme =" + buljonas);

        Boolean geresnisBuljonas = null;
        System.out.println("Kita reiksme = " + geresnisBuljonas);

        int sveikasSkaicius = 5;
        System.out.println(sveikasSkaicius);

        Integer geresnisSveikasSkaicius = null;
        System.out.println(geresnisSveikasSkaicius);

        double nesveikasSkaicius = 6d;
        System.out.println(nesveikasSkaicius);

        Double geresnisNesveikasSkaicius = 5.0;
//        galima ir 5d ir 5.
        System.out.println(geresnisNesveikasSkaicius);

        String tekstas = "Cia yra musu tekstas";
        String tekstas2 = "Kitas musu tekstas";
        System.out.println(tekstas + tekstas2);
        System.out.println(nesveikasSkaicius + geresnisNesveikasSkaicius + tekstas + tekstas2);
        System.out.println(tekstas + tekstas2 + nesveikasSkaicius + geresnisNesveikasSkaicius);
    }
}

// komentaras gali būti eiluitės pabaigoj, tada nereikia uždaryti

/*galima ir taip komentuoti kai
yra daug eilučių komentarų ctrl+shift+/
 */

//KIntamieji gali prasaidėti betkokia raide, $ arba _

//Boolean true false arba null
//Character vienas skaičius arba viena raid
//Byte
//Short
//Integer sveikieji skaičiai
//Long labai ilgais skaičiais
// Float kai daug skaičių po kablelio pvz 3,14...
//Double skaičius su kableliu pvz 1,5 2,8 ir t.t.
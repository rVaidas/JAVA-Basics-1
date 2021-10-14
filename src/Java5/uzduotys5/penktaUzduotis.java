package Java5.uzduotys5;

public class penktaUzduotis { //rasti vidurine raide
    public static void main(String[] args) {
        System.out.println(middleCharacter("testas"));
        System.out.println(middleCharacter("Cepelinai"));
    }


    static char middleCharacter(String word) {  //char kaip string tik viens simbolis
        char[] symbols = word.toCharArray();
        int middleSymbolIndex = (int) Math.ceil(1.0 * symbols.length / 2);
        return symbols[middleSymbolIndex - 1];
    }
}

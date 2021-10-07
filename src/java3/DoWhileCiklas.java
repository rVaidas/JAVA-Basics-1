package java3;

public class DoWhileCiklas {
    public static void main(String[] args) {
        int i = 8;
        do {
            System.out.println("DO BLOKELIS i = " + i); //ciklas ivyks bent vien1 karta nors ir iskart false, o ne kaip while vyks tik tol kol tenkinama salyga
            i++;
        } while(i < 10);
    }
}

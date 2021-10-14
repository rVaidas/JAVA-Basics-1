package Java4;

public class masyvas {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};

        System.out.println(a[1]);
        System.out.println(a[a.length - 1]); // toks uzrasymas isrenka paskutini elementa

//        for(int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);   taip galima išspausdinti visa masyvą
//        }

        int[] b = new int[5]; //jei norim i esama masyva prideti nauju elementu, reikia taip perrasyti masyva
        b[0] = 2;
        b[3] = 888;
    }
}

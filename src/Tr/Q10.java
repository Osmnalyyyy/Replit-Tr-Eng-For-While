package Tr;

public class Q10 {
    public static void main(String[] args) {
        //1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        //OutPut
        //Sayilarin Toplami : 5050
        int sayi=1;
        int toplam=0;
        while (sayi<101){
            toplam+=sayi;
            sayi++;
        }
        System.out.println(toplam);
    }
}

package Tr;

public class Q02 {
    public static void main(String[] args) {
      //Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        //Input :
        //30
        //40
        //	Beklenen Cikti:
        //30 ve 40 icin GCD = 10
        //30 ve 40 icin LCM = 120

        int sayi1=30;
        int sayi2=40;
        int gcd=1;


        for (int i = 1; i <sayi1 ; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                gcd=i;
            }
        }

        int lmc=(sayi1*sayi2)/gcd;
        System.out.println("GCD(En Büyük Ortak Bölen)  "+sayi1+" ve "+sayi2+" = "+gcd);
        System.out.println("LCM(En Küçük Ortak Kat)  "+sayi1+" ve "+sayi2+" = "+lmc);
    }
}

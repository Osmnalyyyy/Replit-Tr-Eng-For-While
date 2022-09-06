package Tr;

public class Q09 {
    public static void main(String[] args) {
        //Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        //Input  :1238
        //Output :Girilen Numananin Tersi: 8321
        int sayi=1238;
        int ters;
        String str="";
        while (sayi>0){
            str+=sayi%10;
            sayi/=10;
        }
        ters=Integer.parseInt(str);
        System.out.println(ters);
    }
}

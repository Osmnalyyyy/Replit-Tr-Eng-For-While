package Tr;

public class Q04 {
    public static void main(String[] args) {
        //Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //
        //Input : 6
        //
        //Output: 6!=6*5*4*3*2*1=720

        int sayi=6;
        int faktoriyel=1;
        for (int i = sayi; i >1 ; i--) {
            faktoriyel*=i;
        }
        System.out.println(sayi+" faktoriyel : "+faktoriyel);

    }
}
package Tr;

public class Q05 {
    public static void main(String[] args) {
        //100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
        //OUTPUT  :
        //100 98 96 94 92 … … … … 2 0
        int sayi=100;
        while (sayi>0){
            if (sayi%2==0){
                System.out.print(sayi+" ");
            }
            sayi--;
        }

        for (int i = 1; i <=100 ; i++) {
            if ((100-i)%2==0){
                System.out.print(100-i+" ");
            }
        }
    }
}

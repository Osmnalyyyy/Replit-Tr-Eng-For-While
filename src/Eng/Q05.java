package Eng;

public class Q05 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 0 but do not use decrement (i--).
        //OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
        for (int i = 0; i <=100 ; i++) {
            if ((100-i)%2==0){
               if ((100-i)<=20){
                   System.out.print(100-i+" ");
               }
            }
        }
    }
}

package Eng;

public class Q04 {
    public static void main(String[] args) {
        //Write a return method that accepts an integer as input and calculates factorial and prints like output.
        //Input : 6
        //Output: 6!=6*5*4*3*2*1=720
        int input=6;
        int factorial=1;
        for (int i = input; i >0 ; i--) {
            factorial*=i;
        }
        System.out.println(input+" factorial : "+factorial);
    }
}

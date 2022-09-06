package Eng;

public class Q09 {
    public static void main(String[] args) {
        //Write a java program to reverse the number which user entered.
        //Input  :1238
        //Output :Reverse Of The Number: 8321
        int input=1238;
        String str="";
        while (input>0){
            str+=input%10;
            input/=10;
        }
        int number=Integer.parseInt(str);
        System.out.println("Reverse Of The Number: "+number);
    }
}

package Eng;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
        //e.g:
        //char ch1= 'a' ;
        //String name =“John came late"
        //Expected Output: Number of a = 2
        Scanner scan=new Scanner(System.in);
        System.out.println("Input a name please");
        String name= scan.nextLine();
        System.out.println("Input a character");
        String character=scan.next().substring(0,1);
        int count=0;

        for (int i = 0; i <name.length() ; i++) {
        if (name.substring(i,i+1).equals(character)){
            count++;
        }
        }
        System.out.println("Number of "+character+" = "+count);
        
        
        
    }
}

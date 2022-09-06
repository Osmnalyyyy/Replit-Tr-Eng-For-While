package Eng;

public class Q03 {
    public static void main(String[] args) {
/*
        Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
 */
        String input="Javaisalsoeasy";
        String str="";
        for (int i = 0; i <input.length() ; i++) {
            if (input.indexOf(input.substring(i,i+1))!=input.lastIndexOf(input.substring(i,i+1))){
               if (!str.contains(input.substring(i,i+1))){
                   str+=input.substring(i,i+1)+" ";
               }
            }
        }
        System.out.println(str);

    }
}

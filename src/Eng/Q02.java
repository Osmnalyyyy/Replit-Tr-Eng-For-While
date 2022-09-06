package Eng;

public class Q02 {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        Input :
        30 and 40
        Expected OutPut:
        GCD for 30 and 40 = 10
        LCM for 30 and 40 = 120
         */
        int input1=30;
        int input2=40;
        int gcd=1;

        for (int i = 1; i <input1 ; i++) {
            if (input1%i==0 && input2%i==0){
                gcd=i;
            }
        }

        int lmc=(input1*input2)/gcd;
        System.out.println("GCD for "+input1+" and "+input2+" = "+gcd);
        System.out.println("LCM for "+input1+" ana "+input2+" = "+lmc);
    }
}

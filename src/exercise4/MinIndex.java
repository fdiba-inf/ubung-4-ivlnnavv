package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length =input.nextInt();

        double[] number = new double[length];
        int index = 0;
        double min=0.0;  
        for ( index= 0 ; index < number.length; index++) {
            number[index] = input.nextDouble();
            if (min==number [index]) {
            min=index;
            break;
            }
        }
        


       System.out.println("Min index: " + index );
       
    }

}
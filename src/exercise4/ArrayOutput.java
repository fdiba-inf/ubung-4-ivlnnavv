package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        String m= " " ;
        int num [] = new int [a] ;

        for (int index = 0; index < num.length; index++) {
            num [index] = input.nextInt();
            }

        for (int index = 0; index < num.length; index++) {
            System.out.println(num [index]);
            System.out.print(m);
            m=m+" ";
            
            }

       
    }

}

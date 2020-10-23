package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int da =input.nextInt();

        double[] pesho = new double[da];
        int cifra = 0;
        double daimo=0.0;  
        for ( cifra= 0 ; cifra < pesho.length; cifra++) {
            pesho[cifra] = input.nextDouble();
            if (daimo<pesho [cifra]) {
            daimo=pesho [cifra];
            } else {
              daimo=daimo;
            }
        }
        


       System.out.println("Max number: " + daimo );
       
    }

}
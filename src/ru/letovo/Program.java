package ru.letovo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printArray(n);
     /*   int z;
        if(1==1) {
            z = 100;
        }
        z = 200;
        for(int k=0;k<100;k++) {
            k++;
        }
        k=100;*/
    }

    public static void printArray(int n) {
        int[] y = new int[n];
        Random r = new Random();
        // Math.random()
        for(int i=0; i<n;i++) {
            y[i] = r.nextInt(1000);
        }
        System.out.println(Arrays.toString(y));
    }


}

package com.company;

public class Main {

    public static void main(String[] args) {

	        int[][] x = { {1,2,3,7}, {5,6,7,4}, {9,3,2,6}, {6,3,2,0} };
	        for(int i=0;i<x.length;i++) {
	            for(int j=0;j<x[i].length;j++) {
	                System.out.print(x[i][j] + " ");
                }
                System.out.println();
            }
	        // Главная диагональ - 1,6,2,0
            // i == j
            System.out.println("-------------");
            for(int i=0;i<x.length;i++) {
                for(int j=0;j<x[i].length;j++) {
                   if(i == j) {
                       System.out.print(x[i][j] + " ");
                   }
                }
            }
            System.out.println("\n-------------");
            // Побочная диагональ - 7,7,3,6
            // i + j = n - 1 (где n - размер матрицы)
            for(int i=0;i<x.length;i++) {
                for(int j=0;j<x[i].length;j++) {
                    if(i + j == 3) {
                        System.out.print(x[i][j] + " ");
                    }
                }
            }
          System.out.println("\n-------------");
            // Все элементы матрицы, которые находятся ниже гл.диагонали
            for(int i=0;i<x.length;i++) {
                for(int j=0;j<x[i].length;j++) {
                    if(i > j) {
                        System.out.print(x[i][j] + " ");
                    }
                }
            }
            System.out.println("\n-------------");
            // Все элементы матрицы, которые находятся выше гл.диагонали
            for(int i=0;i<x.length;i++) {
                for(int j=0;j<x[i].length;j++) {
                    if(i < j) {
                        System.out.print(x[i][j] + " ");
                    }
                }
            }
            System.out.println("\n-------------");
            // Все элементы матрицы, которые находятся ниже побочн. диагонали
            for(int i=0;i<x.length;i++) {
                for(int j=0;j<x[i].length;j++) {
                    if(i+j > 3) {
                        System.out.print(x[i][j] + " ");
                    }
                }
            }

    }
}

package letovo2;

import java.util.Scanner;

public class Program2 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        summ(enterArray(n,m));
    }
    // method
    public static int[][] enterArray(int x, int y) {
        int[][] h = new int[x][y];
        for(int i=0;i<h.length;i++) {
            for (int j = 0; j < h[i].length; j++) {
                h[i][j] = scanner.nextInt();
            }
        }
        return h;
    }
    public static void summ(int[][] h) {
        int sum = 0;
        for(int i=0;i<h.length;i++) {
            for (int j = 0; j < h[i].length; j++) {
                sum += h[i][j];
            }
        }
        System.out.print(sum);
    }
}

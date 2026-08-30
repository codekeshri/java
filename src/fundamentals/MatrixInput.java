package fundamentals;

import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        int a = Math.abs(-10);
        int b = Math.min(2, 3);
        int c = Math.max(2, 3);
        double d = Math.sqrt(4);
        double e = Math.pow(2, 3);
        double f = Math.random()*100;

        boolean flag = Character.isDigit('a');

    }
}

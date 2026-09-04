package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args){
//        int[][] mat = matrixInput();
        int[][] mat = defaultMatrix();
        matrixOutput(mat);
        System.out.println();
        inverseMatrix(mat);
        matrixOutput(mat);
    }

    static void inverseMatrix(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat[i].length; j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
            }
        }
    }

    static boolean isSparse(int[][] mat){
        int count=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==0)count++;
            }
        }
        return 2*count > (mat.length*mat[0].length);
    }

    static boolean isSymmetric(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] != mat[j][i])return false;
            }
        }
        return true;
    }

    static void printMatrixZigzag(int[][] mat){
        for(int i=0; i<mat.length; i++){
            if(i%2 == 0){
                for(int j=0; j<mat[i].length; j++) System.out.print(mat[i][j]+" ");
            }else{
                for(int j=mat[i].length-1; j>=0; j--) System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sortMatrixRowWise(int[][] mat){
        for(int i=0; i<mat.length; i++) {
            Arrays.sort(mat[i]);
        }
    }

    static void printBoundaryElements(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i==0 || j==0 || i==mat.length-1 || j==mat[i].length-1) System.out.print(mat[i][j]+ " ");
                else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }

    static void printUpperTriangle(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i<=j) System.out.print(mat[i][j]+ " ");
                else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }

    static void printLowerTriangle(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i>=j) System.out.print(mat[i][j]+ " ");
                else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }

    static int[][] defaultMatrix(){
        return new int[][]{
                {1, 2, 3, 4},
                {3, 2, 3, 4},
                {2, 2, 3, 4},
                {1, 2, 3, 4}
        };
    }

    static int[][] matrixInput(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0; i<m; i++)for(int j=0; j<n; j++)mat[i][j] = sc.nextInt();
        return mat;
    }

    static void matrixOutput(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package arrays_2d;

import java.util.*;

public class main {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("key found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("key not found");
        return false;
    }

    public static void largest_smallest(int matrix[][]) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(matrix[i][j], largest);
                smallest = Math.min(matrix[i][j], smallest);
            }
        }

        System.out.println("largest element is : " + largest);
        System.out.println("Smallest element is : " + smallest);

    }

    public static void spiralMatrix(int spiralMatrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = spiralMatrix.length - 1;
        int endCol = spiralMatrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(spiralMatrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(spiralMatrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(spiralMatrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(spiralMatrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];

            if (i != matrix.length - 1 - i) {
                // secondary diagonal
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key) {

        // int row = 0, col = matrix[0].length -1;

        // while(row < matrix.length && col >=0){
        // if(key == matrix[row][col]){
        // System.out.println("key found at (" + row + ","+col+")");
        // return true;
        // }
        // else if(key < matrix[row][col]){
        // col--;
        // }
        // else if(key > matrix[row][col]){
        // row++;
        // }
        // }

        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (key == matrix[row][col]) {
                System.out.println("key found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else if (key > matrix[row][col]) {
                col++;
            }
        }

        System.out.println("key not found!");
        return false;
    }

    public static void main(String args[]) {

        // int matrix[][] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // input
        // for(int i=0; i<n; i++){
        // for(int j=0; j<m; j++){
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // output
        // for(int i=0; i<n; i++){
        // for(int j=0; j<m; j++){
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // search(matrix, 5);

        // largest_smallest(matrix);

        // int matrix[][] = { { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };

        // int matrix[][] = { { 1, 2, 3, },
        // { 4, 5, 6, },
        // { 7, 8, 9, } };

        // spiralMatrix(matrix);

        // for(int i=0; i<matrix.length; i++){
        // // System.out.print(matrix[i][i]+" ");
        // System.out.print(matrix[i][matrix.length-1-i]+" ");
        // }

        // System.out.println(diagonalSum(matrix));

        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 33;

        staircaseSearch(matrix, key);

    }
}

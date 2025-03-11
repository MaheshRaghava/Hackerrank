import java.util.*;

public class MatrixFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m + 1;

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int minValue = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];

                if (checkRow(matrix, i, j, num) || checkColumn(matrix, i, j, num) || checkDiagonals(matrix, i, j, num)) {
                    minValue = Math.min(minValue, num);
                    found = true;
                }
            }
        }

        System.out.println(found ? minValue : -1);
    }

    static boolean checkRow(int[][] matrix, int i, int j, int num) {
        int count = 1;
        int n = matrix[0].length;

        for (int k = j + 1; k < n && matrix[i][k] == num; k++) {
            count++;
            if (count >= 3) return true;
        }
        return false;
    }

    static boolean checkColumn(int[][] matrix, int i, int j, int num) {
        int count = 1;
        int m = matrix.length;

        for (int k = i + 1; k < m && matrix[k][j] == num; k++) {
            count++;
            if (count >= 3) return true;
        }
        return false;
    }

    static boolean checkDiagonals(int[][] matrix, int i, int j, int num) {
        int count = 1, m = matrix.length, n = matrix[0].length;
        
        for (int k = 1; i + k < m && j + k < n && matrix[i + k][j + k] == num; k++) {
            count++;
            if (count >= 3) return true;
        }

        count = 1;
        for (int k = 1; i + k < m && j - k >= 0 && matrix[i + k][j - k] == num; k++) {
            count++;
            if (count >= 3) return true;
        }

        return false;
    }
             }

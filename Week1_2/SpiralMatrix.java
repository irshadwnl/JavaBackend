package Week1_2;
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int left = 0;
        int right = mat[0].length - 1;
        int up = 0;
        int down = mat.length - 1;
        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                System.out.print(mat[up][i] + " ");
            }
            up++;  
            for (int i = up; i <= down; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[down][i] + " ");
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}

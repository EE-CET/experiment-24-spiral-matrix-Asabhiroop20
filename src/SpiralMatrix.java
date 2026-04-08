 import java.util.*;
public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        // Input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        StringBuilder sb = new StringBuilder();

        while (top <= bottom && left <= right) {

            // 1. Left → Right
            for (int j = left; j <= right; j++) {
                sb.append(mat[top][j]).append(" ");
            }
            top++;

            // 2. Top → Bottom
            for (int i = top; i <= bottom; i++) {
                sb.append(mat[i][right]).append(" ");
            }
            right--;

            // 3. Right → Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    sb.append(mat[bottom][j]).append(" ");
                }
                bottom--;
            }

            // 4. Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    sb.append(mat[i][left]).append(" ");
                }
                left++;
            }
        }

        // Print without trailing space
        System.out.println(sb.toString().trim());
    }
}
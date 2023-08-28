package classwork.chapter5;

public class Matrix {
    public static void main(String[] args) {
        int m[][] = {
                {1 * 2, 1 * 3, 1 * 4, 1 * 5},
                {2 * 1, 2 * 2, 2 * 3, 2 * 4},
                {3 * 1, 3 * 2, 3 * 3, 3 * 4},
                {4 * 1, 4 * 2, 4 * 3, 4 * 4},

        };
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}

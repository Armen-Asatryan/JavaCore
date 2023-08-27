package classwork.chapter5;

public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int a, b, c = 0;

        for (a = 0; a < 4; a++)
            for ( b = 0; b < 5; b++) {
                twoD[a][b] = c;
                c++;
            }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();


        }

    }

}



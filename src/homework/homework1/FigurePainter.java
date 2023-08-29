package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int a = 5;
        for (int i = 1; i <= a; i++) {

            for (int j = i; j < a; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        int b = 5;
        for (int i = 1; i <= b; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int d = 5;
        for (int i = 1; i <= d; i++) {

            for (int j = i; j < d; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        int c = 5;
        for (int i = 1; i <= c; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= c; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

















































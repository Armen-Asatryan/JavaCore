package homework.work2;

public class Scope {
    public static void main(String[] args) {

        int x = 10;
        if (x == 10) {

            int y = 20;
            System.out.println("x и у: " + x + " " + y);
            x = y * 2;

        }
    }
}

package classwork.chapter7;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println(n);
            n--;

        } while (n > 0);
        do {
            System.out.println(n);

        } while (--n > 0);
    }
}

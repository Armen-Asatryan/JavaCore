package classwork.chapter7;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrimne;
        num = 14;
        if (num < 2) isPrimne = false;
        else isPrimne = true;

        for (int i = 2; i < num / i; i++) {
            if ((num % i) == 0) {
                isPrimne = false;
                break;
            }

        }
    }
}

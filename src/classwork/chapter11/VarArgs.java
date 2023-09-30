package classwork.chapter11;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Koличecтвo аргументов: "
                + v.length + " Содержимое: ");
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 6);
        vaTest();

    }
}

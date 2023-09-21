package classwork.chapter10;

public class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a) {
        System.out.println("int a:" + a);
    }
    void test(int a, int b) {
        System.out.println("int a:" + a);
        System.out.println("int b:" + b);
    }

    void test(double a, double b) {
        System.out.println("double a:" + a);
        System.out.println("double b:" + b);
    }

    void test(String a) {
        System.out.println("String a:" + a);
    }
}

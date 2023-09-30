package classwork.chapter11;

public class Outer {
    int outerX = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("вывoд: outer_x " + outerX);
        }
    }
}
class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

package homework.dynamicarray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(1);
        dy.add(2);
        dy.add(3);
        dy.add(4);
        dy.add(5);
        dy.print();
        dy.deleteByIndex(4);
        dy.print();
        System.out.println(dy.exists(6));

    }
}

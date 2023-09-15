package classwork.chapter9;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(15, 20, 24);
        Box myBox2 = new Box(10, 10, 10);

        double vol;
        vol = myBox1.volume();
        System.out.println("Oбъeм равен" + vol);
        vol = myBox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }
}

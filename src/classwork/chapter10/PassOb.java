package classwork.chapter10;

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(200,11);
        Test ob2 = new Test(200,11);
        Test ob3 = new Test(22,64);
        Test ob4 = new Test(22,55);
        Test ob5 = new Test(22,64);
        Test ob6 = new Test(12,64);
        Test ob7 = new Test(200,11);
        Test ob8 = new Test(46,64);

        System.out.println("ob1 == ob2" + ob1.equalTo(ob8));
        System.out.println("ob1 == ob2" + ob1.equalTo(ob7));
    }
}

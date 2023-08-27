package homework.work2;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for ( x = 0; x < 6; x++) {
            int y = 3;
            System.out.println(" y = " + y);
            y = 100;
            System.out.println("y now = " + y) ;

            
        }
    }
}

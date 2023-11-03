package classwork.chapter12;

public class EnumDemo1 {
    static class EnumDemo {
        public static void main(String[] args) {
            Apple ap;
            ap = Apple.REDDEL;

            System.out.println("Знaчeниe ар: " + ap);
            System.out.println();

            ap = Apple.GOLDENDEL;
            if (ap == Apple.GOLDENDEL) {
                System.out.println("Переменная ар содержит GoldenDel.");
                System.out.println();
                switch (ap) {
                    case JONATHAN:
                        System.out.println("Copт Jonathan красный.");
                        break;
                    case GOLDENDEL:
                        System.out.println("Сорт Golden Delicious желтый.");
                        break;
                    case  REDDEL:
                        System.out.println("Copт RedDelicious красный.");
                        break;
                    case WINESAP:
                        System.out.println("Copт Winesap красный.");
                        break;
                    case CORTLAND:
                        System.out.println("Copт Cortland красный.");
                        break;



                }

            }
        }
    }
}

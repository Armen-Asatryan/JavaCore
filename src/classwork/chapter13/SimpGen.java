package classwork.chapter13;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj = new TwoGen<>(777,"Обобщения");
        tgObj.showType();
        int v = tgObj.getOb1();
        System.out.println("Знaчeниe "+"-> "+ v+ " <-");
        String str = tgObj.getOb2();
        System.out.println("Знaчeниe: " + "-> "+str+" <-") ;

    }
}

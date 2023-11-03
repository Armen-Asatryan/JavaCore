package classwork.chapter12;

public enum Apple {
    JONATHAN(10), GOLDENDEL(9), REDDEL(12), WINESAP(15), CORTLAND(18);
    private int price;

    Apple(int р) {
        price = р;
    }
    int getPrice(){
        return price;

    }
}


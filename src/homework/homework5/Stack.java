package homework.homework5;

public class Stack {
    private int[] array = new int[10];
    private int index;

    public Stack() {
        index = -1;

    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("Cтeк заполнен.");
        } else {
            array[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            return 0;
        } else {
            return array[index--];
        }
    }
    public int getIndex(){
        return index;
    }

}

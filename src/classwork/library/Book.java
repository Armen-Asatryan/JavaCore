package classwork.library;

public class Book {
    private String title;
    private String authorName;
    private double price;
    private int count;

    public Book(String title, String authorname, double price, int count) {
        this.title = title;
        this.authorName = authorname;
        this.price = price;
        this.count = count;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorname() {
        return authorName;
    }

    public void setAuthorname(String authorname) {
        this.authorName = authorname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

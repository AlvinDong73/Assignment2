public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void display() {
        System.out.printf("%s was written by %s in %d\n", this.name, this.author, this.year);
    }
}

import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Currently creating 2 books!");
        
        System.out.println("What is the name of the first book?");
        String book1Name = keyboard.nextLine();
        System.out.println("Who is the author of the first book?");
        String book1Author = keyboard.nextLine();
        System.out.println("When was the first book written?");
        int book1Year = keyboard.nextInt();
        keyboard.nextLine();

        Book book1 = new Book(book1Name, book1Author, book1Year);
        
        System.out.println("What is the name of the second book?");
        String book2Name = keyboard.nextLine();
        System.out.println("Who is the author of the second book?");
        String book2Author = keyboard.nextLine();
        System.out.println("When was the second book written?");
        int book2Year = keyboard.nextInt();

        Book book2 = new Book(book2Name, book2Author, book2Year);

        book1.display();
        book2.display();

        keyboard.close();
    }
}

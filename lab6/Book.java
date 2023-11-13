package lab6;

public class Book {
    private String name;
    private String author;
    private String ISBN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISPN() {
        return ISBN;
    }

    public void setISPN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String name, String author, String ISBN) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
    }
}

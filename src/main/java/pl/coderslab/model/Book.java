package pl.coderslab.model;

public class Book {

    private long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

    public Book(long id, String isbn, String title, String author, String publisher, String type) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
    }

}
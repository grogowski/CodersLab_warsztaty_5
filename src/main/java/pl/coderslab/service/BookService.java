package pl.coderslab.service;

import pl.coderslab.model.Book;
import java.util.List;

public interface BookService {

    public List<Book> getList();

    public Book getBookById(long id);

    public void updateBook(Book b);

    public void deleteBook(long id);

    public void addBook(Book b);
}

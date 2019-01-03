package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Book> booksList(){
        return bookService.getList();
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    private Book getBookById(@PathVariable("bookId") long bookId) {
        return bookService.getBookById(bookId);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    private void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    private void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.DELETE)
    private void deleteBook(@PathVariable("bookId") long bookId) {
        bookService.deleteBook(bookId);
    }

}

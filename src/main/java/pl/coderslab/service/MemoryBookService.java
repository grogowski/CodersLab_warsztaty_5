package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class MemoryBookService implements BookService{
    private List<Book> list;

    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public Book getBookById(long id) {
        for (Book b:list) {
            if (b.getId()==id) {
                return b;
            }
        }
        return null;
    }

    public void updateBook(Book b) {
        int index=-1;
        for (Book wanted:list) {
            if(wanted.getId()==b.getId()) {
                index = list.indexOf(wanted);
                break;
            }
        }
        if (index!=-1) {
            list.set(index, b);
        }
    }

    public void deleteBook(long id) {
        Iterator<Book> iterator = list.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getId()==id) {
                iterator.remove();
                break;
            }
        }
    }

    public void addBook(Book b) {
        if (list.isEmpty()) {
            b.setId(1L);
        } else {
            b.setId(list.get(list.size() - 1).getId() + 1);
        }
        list.add(b);
    }


}

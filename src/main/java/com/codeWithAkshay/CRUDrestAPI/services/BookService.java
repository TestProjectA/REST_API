package com.codeWithAkshay.CRUDrestAPI.services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.codeWithAkshay.CRUDrestAPI.Entities.Book;


@Component
public class BookService {
    private static List<Book> al = new ArrayList();
    static {
        al.add(new Book("Ruchita Yadav", 12345, "CodeWithAkshay "));
        al.add(new Book("Darshana Yadav", 12346, "Java Is life "));
        al.add(new Book("Girija Yadav", 12347, "Every One should Love JAVA "));
    }

    public BookService() {
    }

    public List<Book> getAllBooks() {
        return al;
    }

    public Book getBookByID(int id) {
        new Book();
        Book book = (Book)al.stream().filter((e) -> {
            return e.getId() == id;
        }).findFirst().get();
        return book;
    }

    public Book addBook(Book b) {
        al.add(b);
        return b;
    }

    public void DeleteBook(int bId) {
        al = al.stream().filter((book) -> {
            return book.getId() != bId;
        }).collect(Collectors.toList());
    }

    public void UpdateBook(Book book, int bookid) {
        al = al.stream().map((b) -> {
            if (b.getId() == bookid) {
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }

            return b;
        }).collect(Collectors.toList());
    }


}

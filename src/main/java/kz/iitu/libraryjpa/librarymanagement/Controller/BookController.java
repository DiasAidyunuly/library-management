package kz.iitu.libraryjpa.librarymanagement.Controller;

import kz.iitu.libraryjpa.librarymanagement.Entity.Book;
import kz.iitu.libraryjpa.librarymanagement.Entity.BookStatus;
import kz.iitu.libraryjpa.librarymanagement.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/all")
    public List<Book> getAll(){
        return bookRepository.findAll();
    }
    @GetMapping("/find/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookRepository.findById(id).get();

    }
    @GetMapping("/find/title")
    public List<Book> getBookByTitle(@RequestParam String title){
        return bookRepository.findByTitleContaining(title);
    }
    @GetMapping("/find/status")
    public List<Book> getByStatus(@RequestParam BookStatus status){
        return bookRepository.findByStatusEquals(status);
    }
    @GetMapping("/find/byAuthor")
    public List<Book> getByAuthor(@RequestParam String name){
        return bookRepository.findByAuthor(name);
    }
    @GetMapping("/find/year")
    public List<Book> getByYear(@RequestParam("year1") Integer year1,
                                @RequestParam("year2") Integer year2){
        return bookRepository.findByYearOfPubBetween(year1,year2);
    }
    @PostMapping("/post")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @PatchMapping("/updateStatus/{id}")
    public Book updateBookStatus(@PathVariable Long id,
                           @RequestBody BookStatus status) {
        Book book = bookRepository.findById(id).get();
        book.setStatus(status);
        return bookRepository.saveAndFlush(book);
    }

}

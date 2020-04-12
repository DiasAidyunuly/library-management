package kz.iitu.libraryjpa.librarymanagement.Controller;

import kz.iitu.libraryjpa.librarymanagement.Entity.Author;
import kz.iitu.libraryjpa.librarymanagement.Entity.Book;
import kz.iitu.libraryjpa.librarymanagement.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/all")
    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Author getAuthorById(@PathVariable Long id){
        return authorRepository.findById(id).get();
    }
    @GetMapping("/find")
    public List<Author> getByName(@RequestParam String name){
        return authorRepository.findByNameContaining(name);
    }
    @PostMapping("/post")
    public Author addAuthor(@RequestBody Author author) {
        return authorRepository.saveAndFlush(author);
    }
}

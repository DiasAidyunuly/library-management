package kz.iitu.libraryjpa.librarymanagement.Controller;

import kz.iitu.libraryjpa.librarymanagement.Entity.BookCategory;
import kz.iitu.libraryjpa.librarymanagement.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/all")
    public List<BookCategory> getCategories(){
        return categoryRepository.findAll();
    }

    @PostMapping("/addCategory")
    public BookCategory addCategory(@RequestBody BookCategory category){
        return categoryRepository.saveAndFlush(category);
    }
    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
    }
}

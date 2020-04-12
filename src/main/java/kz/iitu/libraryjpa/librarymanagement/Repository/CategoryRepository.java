package kz.iitu.libraryjpa.librarymanagement.Repository;

import kz.iitu.libraryjpa.librarymanagement.Entity.Author;
import kz.iitu.libraryjpa.librarymanagement.Entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<BookCategory, Long> {

}

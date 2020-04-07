package kz.iitu.libraryjpa.librarymanagement.Repository;

import kz.iitu.libraryjpa.librarymanagement.Entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<BookCategory, Long> {
}

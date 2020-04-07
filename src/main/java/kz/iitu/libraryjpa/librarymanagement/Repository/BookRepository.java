package kz.iitu.libraryjpa.librarymanagement.Repository;

import kz.iitu.libraryjpa.librarymanagement.Entity.Book;
import kz.iitu.libraryjpa.librarymanagement.Entity.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);

    List<Book> findByStatusEquals(BookStatus issued);

    @Query(value = "SELECT * FROM Book AS b INNER JOIN Author AS a ON author_id = a.id WHERE a.name =?1",
            nativeQuery = true)
    List<Book> findByAuthor(String name);
}

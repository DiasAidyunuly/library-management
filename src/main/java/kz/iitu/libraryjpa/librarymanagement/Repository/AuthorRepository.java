package kz.iitu.libraryjpa.librarymanagement.Repository;

import kz.iitu.libraryjpa.librarymanagement.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
    List<Author> findByNameContaining(String name);
}

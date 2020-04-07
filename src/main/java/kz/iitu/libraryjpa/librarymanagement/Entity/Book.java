package kz.iitu.libraryjpa.librarymanagement.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer YearOfPub;


    @ManyToMany(mappedBy = "bookList", fetch = FetchType.LAZY)
    private List<BookCategory> categoryList;

    @Enumerated(EnumType.STRING)
    private BookStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private List<BookIssue> num_issued;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearOfPub() {
        return YearOfPub;
    }

    public void setYearOfPub(Integer yearOfPub) {
        YearOfPub = yearOfPub;
    }

    public List<BookCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<BookCategory> categoryList) {
        this.categoryList = categoryList;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


}

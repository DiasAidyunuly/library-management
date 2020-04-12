package kz.iitu.libraryjpa.librarymanagement;

import kz.iitu.libraryjpa.librarymanagement.Entity.Book;
import kz.iitu.libraryjpa.librarymanagement.Entity.BookStatus;
import kz.iitu.libraryjpa.librarymanagement.Repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}


};


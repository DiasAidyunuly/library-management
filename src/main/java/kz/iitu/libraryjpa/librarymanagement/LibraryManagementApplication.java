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
	@Bean
	public CommandLineRunner bootstrap(BookRepository repository){
		return (args) ->{

			//Show all issued books
			System.out.println("\nISSUED BOOKS: ");
			for(Book book : repository.findByStatusEquals(BookStatus.ISSUED)){
				System.out.println(book.getTitle());
			}

			//Show all requested books
			System.out.println("\nAVAILABLE BOOKS: ");
			for(Book book : repository.findByStatusEquals(BookStatus.RETURNED)){
				System.out.println(book.getTitle());
			}

			//Search by title
			System.out.println("\nSEARCH BY TITLE: ");
			for(Book book : repository.findByTitleContaining("The")){
				System.out.println(book.getTitle());
			}
			//Search by author
			System.out.println("\nSEARCH BY AUTHOR NAME: ");
			for(Book book : repository.findByAuthor("W.Shakespeare")){
				System.out.println(book.getTitle());
			}



		};
	}

}

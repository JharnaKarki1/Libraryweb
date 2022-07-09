package edu.mum.cs.cs425.elibrary.repository;

import edu.mum.cs.cs425.elibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Spring Data JPA Method Queries
    List<Book> findBooksByTitleContains(String str);

    @Query(value = "select * from books b where b.price < :price", nativeQuery = true)
    List<Book> getCheapBooks(Double price);

}

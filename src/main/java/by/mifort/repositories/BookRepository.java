package by.mifort.repositories;

import by.mifort.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "SELECT * FROM Book as b WHERE lower(b.title) "
            + "LIKE concat('%', :q,'%') "
            + "OR lower(b.authors) LIKE concat('%', :q,'%') OR "
            + "lower(b.tags) LIKE concat('%', :q,'%')", nativeQuery = true)
    List<Book> search(@Param("q") String q);

    Book findByTitle(String title);
}

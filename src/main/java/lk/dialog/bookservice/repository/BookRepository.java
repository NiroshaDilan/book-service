package lk.dialog.bookservice.repository;

import lk.dialog.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author DILAN on 2018-03-19
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}

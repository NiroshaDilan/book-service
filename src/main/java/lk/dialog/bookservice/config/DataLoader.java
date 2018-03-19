package lk.dialog.bookservice.config;

import lk.dialog.bookservice.model.Book;
import lk.dialog.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author DILAN on 2018-03-19
 */
@Component
public class DataLoader implements ApplicationRunner {

    private BookService bookService;

    @Autowired
    public DataLoader(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.bookService.createBook(new Book("Aldous Huxley", "Brave new world"));
        this.bookService.createBook(new Book("George Orwell", "Animal Farm"));
    }
}

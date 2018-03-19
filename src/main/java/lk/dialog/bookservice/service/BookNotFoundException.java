package lk.dialog.bookservice.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author DILAN on 2018-03-19
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

    BookNotFoundException(String message) {
        super(message);
    }
}

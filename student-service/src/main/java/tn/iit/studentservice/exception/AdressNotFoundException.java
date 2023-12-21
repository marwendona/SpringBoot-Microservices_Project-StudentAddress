package tn.iit.studentservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AdressNotFoundException extends RuntimeException {
    public AdressNotFoundException(String message) {
        super(message);
    }
}

package com.nexim.nexim.configuration.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private HttpStatus statusCode;

    public ServiceException(HttpStatus statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }
}

package com.totalplay.mx.middlewareconsultsiptv.exception;

import java.util.ArrayList;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ExceptionClass extends ResponseEntityExceptionHandler {

    // error en el request
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {

        ArrayList<String> errors = new ArrayList<String>();
        errors.add("Request con formato erróneo");
        ExceptionResponse ex2 = new ExceptionResponse("101", errors);

        return handleExceptionInternal(ex, ex2, headers, status, request);
    }

    // Lanza exception generada por valid
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        ArrayList<String> errors = new ArrayList<String>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.add(error.getField() + ": " + error.getDefaultMessage());
        }

        ExceptionResponse ex2 = new ExceptionResponse("101", errors);

        return handleExceptionInternal(ex, ex2, headers, status, request);
    }

}

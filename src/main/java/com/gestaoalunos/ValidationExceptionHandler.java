package com.gestaoalunos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValidationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<Map<String,String>>> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        
        List<Map<String, String>> retorno = new ArrayList<Map<String,String>>();
        
        ex.getBindingResult().getFieldErrors().forEach(error -> {
        	Map<String, String> errors = new HashMap<>();
            errors.put("erro", error.getDefaultMessage());
            errors.put("campo", error.getField());
            retorno.add(errors);
        });
        
        return ResponseEntity.badRequest().body(retorno);
    }
}

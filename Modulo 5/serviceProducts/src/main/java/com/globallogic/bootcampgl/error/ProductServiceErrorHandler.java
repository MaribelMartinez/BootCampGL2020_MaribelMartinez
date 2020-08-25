package com.globallogic.bootcampgl.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceErrorHandler {

	
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<Object> handleHttpMessageNotReadableException(final HttpMessageNotReadableException exception) {
		return new ResponseEntity<>(new ResponseError("ERROR MENSAJE MAL FORMADO", "400", "/products"), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleHttpMessageNotReadableException(final MethodArgumentNotValidException exception) {
		return new ResponseEntity<>(new ResponseError("ERROR EN DATOS ESPERADOS", "400", "/products"), HttpStatus.BAD_REQUEST);
	}
}

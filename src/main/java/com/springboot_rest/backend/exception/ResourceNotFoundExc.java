package com.springboot_rest.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundExc extends RuntimeException{
	
	private static final long serialVersionUID=1L;
	
	public ResourceNotFoundExc(String message) {
		super(message);
	};

}

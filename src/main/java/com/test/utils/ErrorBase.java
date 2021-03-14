package com.test.utils;

import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ErrorBase extends RuntimeException{

	private static final long serialVersionUID = 4770555776611077942L;

	public ErrorBase(@Nullable String error) {
		super(error);
	}
}
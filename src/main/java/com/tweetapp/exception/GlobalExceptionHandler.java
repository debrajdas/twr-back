package com.tweetapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	public String handleUserError(Exception ex) {
		LOGGER.error(ex.getMessage(), ex);
		return ex.getMessage();

	}

}

package com.alia.projectmanagement.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

/**
 * Created by Ali on Kas,2020
 */
@ControllerAdvice
@RestController
@Slf4j
public class ProjectManagementExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<?> handleExceptions(Exception ex, WebRequest request) {
        ExceptionResponse  exceptionResponse =new ExceptionResponse(new Date(),ex.getMessage());
        log.error("ControllerAdvice -> ExceptionHandler -> " , ex ,request);
        return new ResponseEntity<>(exceptionResponse , HttpStatus.EXPECTATION_FAILED);
    }
}
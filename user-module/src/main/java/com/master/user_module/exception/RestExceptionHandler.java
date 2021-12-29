package com.master.user_module.exception;

import com.master.user_module.exception.response.Error;
import com.master.user_module.exception.response.ErrorDetails;
import com.master.user_module.util.CustomExceptionMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;

@ControllerAdvice
@Slf4j
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private static final HttpHeaders HEADERS = new HttpHeaders();

    static {
        HEADERS.setContentType(MediaType.APPLICATION_JSON);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {
        List<Error> errorList = ex.getBindingResult().getAllErrors()
                .stream()
                .map(objectError -> Error.builder()
                        .message(objectError.getDefaultMessage())
                        .errorCode(CustomExceptionMessage.BAD_REQUEST)
                        .build()).toList();
        log.error("Data not valid and contains {} error(s)", errorList.size());
        return new ResponseEntity<>(ErrorDetails.builder()
                .localDateTime(LocalDateTime.now())
                .errors(errorList)
                .build(), HEADERS, HttpStatus.BAD_REQUEST);
    }
}

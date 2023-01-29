package com.bank.exception;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.webjars.NotFoundException;

import javax.persistence.EntityNotFoundException;

@Data
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleEntityNotFoundException(EntityNotFoundException e) {
        System.out.println("@@@@@@@@@@@@Lol@@@@@@@@@@@@@@");
        log.error(e.getMessage(), e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFound(NotFoundException e) {
        System.out.println("|||||||||||||||||||||||||||||");
        log.error(e.getMessage(), e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}



//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(NotFoundException.class)
//        public ResponseEntity<String> handleNotFound(    @ExceptionHandler(NotFoundException.class)
//                                                     e, HttpServletRequest request) {
//        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
//    }
//}

//    @ExceptionHandler(UnsupportedOperationException.class)
//    @ExceptionHandler(ValidationErrorException.class)
//    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
//    @ResponseBody
//    public ErrorInfo handlerIllegalArgumentException(HttpServletRequest request,
//                                                     HttpServletResponse response, Exception ex){
//        return new ErrorInfo(request, "Вы ввели не корректный аргумент");
//    }
//    @ExceptionHandler(TypeMismatchException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ErrorInfo handleTypeMismatchException(HttpServletRequest request,
//                                                           HttpServletResponse response, Exception ex){
//        return new ErrorInfo(request, "HttpMessageNotReadableException - Текст ошибки написать тут");
//    }


//    @ExceptionHandler({NotFoundException.class})
//    public ResponseEntity onNotFoundException(final RuntimeException e,
//                                              final ServletWebRequest request) {
//        LOGGER.error(getLogMessage(HttpStatus.NOT_FOUND, e.getMessage(), getRequestPath(request), e));
//        return handleExceptionInternal(e, e.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
//    }








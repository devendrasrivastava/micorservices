package in.stackroute.userprofile.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ControllerAdvice
public class APIExceptionHandeller {
    Logger logger = LoggerFactory.getLogger(APIExceptionHandeller.class);

    @ExceptionHandler(UserExistsException.class)
    public ResponseEntity<?> handleUserExistsException(UserExistsException e){
        logger.error("An error Message to check handleUserExistsException called or not......devendra ");
        return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(CredentialsMismatchException.class)
    public ResponseEntity<?> handleCredentialsMismatchException(CredentialsMismatchException e){
        logger.error("An error Message to check handleCredentialsMismatchException called or not......devendra ");
        return new ResponseEntity<>(e.getMessage(),HttpStatus.UNAUTHORIZED);
    }


}

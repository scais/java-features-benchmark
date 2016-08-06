package fundamentals.exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsThrowing {

    public void throwException() throws Exception {
        throw new Exception("I am an exception");
    }

    public void throwsExceptionMultipleExceptions(int random) throws EOFException, FileNotFoundException {
        if (random < 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }

    public void throwsExceptionMultipleExceptionsUnited(int random) throws IOException {
        if (random < 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }

    public void throwsExceptionWithoutReason() throws Exception {

    }

    public void throwsUncheckedException() {
        throw new RuntimeException();
    }

}

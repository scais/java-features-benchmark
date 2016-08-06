package fundamentals.exceptions;

public class ExceptionsCatching {

    public void throwException() throws Exception {
        throw new Exception("I am an exception");
    }

    public void justCatch() {
        try {
            throwException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void catchWithFinally() {
        try {
            throwException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // do something
        }
    }

    public void catchMultipleExceptions() {
        try {
            throwException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void catchMultipleExceptionsWithFinally() {
        try {
            throwException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // do something
        }
    }

    public void justFinally() {
        try {

        } finally {

        }
    }

}

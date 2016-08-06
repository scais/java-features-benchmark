package fundamentals.multithreading;

public class Synchronized {

    private Object sync;

    public synchronized void synchronizedMethod() {

    }

    public void synchronizedBlock() {
        synchronized(sync) {

        }
    }

    public void synchronizedThis() {
        synchronized (this) {

        }
    }

}

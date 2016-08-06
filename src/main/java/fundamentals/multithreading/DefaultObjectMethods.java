package fundamentals.multithreading;

public class DefaultObjectMethods {

    public void run() throws InterruptedException {
        this.wait();
        this.wait(1000);
        this.notify();
        this.notifyAll();
    }
}

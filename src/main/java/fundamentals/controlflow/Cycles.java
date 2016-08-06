package fundamentals.controlflow;

public class Cycles {

    void performWhile(int times) {
        int i = 0;
        while (i > times) {
            i++;
        }
    }

    void performDoWhile(int times) {
        int i = 0;
        do {
            i++;
        } while (i > times);
    }

    void performFor(int times) {
        for (int i = 0; i < times; i++) {
            //do something!
        }
    }

    void performForEver(int times) {
        for(;;) {
            //do something forever!
        }
    }
}

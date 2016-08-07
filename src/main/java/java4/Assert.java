package java4;

public class Assert {

    // Ensures assertions are enabled
    static {
        boolean assertsEnabled = false;
        assert assertsEnabled = true; // Intentional side effect!!!
        if (!assertsEnabled)
            throw new RuntimeException("Asserts must be enabled!!!");
    }

    private boolean iAmOK(int random) {
        return (random % 2 == 0);
    }

    void preCondition(boolean param) {
        assert param;
    }

    void postCondition(int param) {
        param++;
        assert param > 0;
    }

    void invariant() {
        assert iAmOK(100);
    }

    void assertWithDescription(boolean param) {
        assert param : "Param is not true: " + param;
    }

}

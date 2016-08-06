package fundamentals.constructor;

public class ConstructorOverload {

    private int i;
    private String foo;

    public ConstructorOverload() {
        this(0);
    }

    public ConstructorOverload(int i) {
        this(i, "");
    }

    public ConstructorOverload(int i, String foo) {
        this.i = i;
        this.foo = foo;
    }
}

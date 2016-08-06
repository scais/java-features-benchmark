package fundamentals.buildingblocks;

public class Methods {

    public void foo() {
        System.out.println("foo");
    }

    public void bar() {
        System.out.println("bar");
        foo();
    }

    public void bux() {
        System.out.println("bux");
        bar();
    }

    public void baz() {
        System.out.println("baz");
        bux();
    }

    public void boo() {
        System.out.println("boo");
        baz();
    }

    void call() {
        boo();
    }

}

package fundamentals.inheritance;

public interface InheritanceInterfaces {

    interface A {
        void foo();
    }

    interface B extends A {
        void foo();
        int bar();
    }

    interface C extends B, A {
        void foo();
        int bar();
    }

}

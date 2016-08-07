package java5.generics;

public class MultipleBounds {

    class A {
        void fooA() {
        }
    }

    interface B {
        void fooB();
    }

    interface C {
        void fooC();
    }

    class Foo<T extends A & B & C> {

        T item;

        void doFoo() {
            item.fooA();
            item.fooB();
            item.fooC();
        }

    }

}

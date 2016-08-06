package fundamentals.buildingblocks;

public class AnonymousClasses {

    interface Foo {
        void foo();
    }

    abstract class Bar {
        abstract void bar();
        abstract void bux();
    }

    public void boo() {

        Foo foo = new Foo() {
            public void foo() {

            }
        };

        Bar bar = new Bar() {
            @Override
            void bar() {

            }

            @Override
            void bux() {

            }
        };

    }

}

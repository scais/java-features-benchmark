package fundamentals.constructor;

public class SuperConstructor {

    class A {

        int foo;

        public A(int foo) {
            this.foo = foo;
        }
    }

    class B extends A {

        public B(int foo) {
            super(foo);
        }
    }

}

package java6.annotation;

import java5.annotations.Annotations;

public class AnnotationsInInterfaces {

    interface Foo {
        void foo();
    }

    class Bar implements Foo {

        @Override
        public void foo() {
        }
    }

}

package fundamentals.buildingblocks;

public class AbstractClass {

    abstract class HasAbstractMethod {

        abstract void foo();

        void bar() {
            foo();
        }
    }

    class ExtendsAbstract extends HasAbstractMethod {

        void foo() {

        }
    }

}

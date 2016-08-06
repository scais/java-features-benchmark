package fundamentals.inheritance;

public class InheritanceClasses {

    public class A {
        public void fooPublic() {
            System.out.println("From A");
        }

        protected void fooProtected() {
            System.out.println("From A");
        }

        void fooPackagePrivate() {
            System.out.println("From A");
        }

        private void fooPrivate() {
            System.out.println("From A");
        }
    }

    public class B extends A {
        public void fooPublic() {
            System.out.println("From B");
        }

        protected void fooProtected() {
            System.out.println("From B");
        }

        void fooPackagePrivate() {
            System.out.println("From B");
        }

        private void fooPrivate() {
            System.out.println("From B");
        }
    }

}

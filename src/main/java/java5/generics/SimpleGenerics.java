package java5.generics;

public class SimpleGenerics {

    class GenericClass<T> {

        T item;

        public GenericClass(T item) {
            this.item = item;
        }
    }
}

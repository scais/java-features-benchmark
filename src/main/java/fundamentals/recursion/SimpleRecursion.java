package fundamentals.recursion;

public class SimpleRecursion {

    void directRecursion(int foo) {
        System.out.println(foo);
        while (foo > 0) {
            foo--;
            directRecursion(foo);
        }
    }

}

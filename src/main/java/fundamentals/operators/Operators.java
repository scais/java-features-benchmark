package fundamentals.operators;

/**
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
 */
public class Operators {

    void arithmetic() {
        int result = 1 + 2;
        result = result - 1;
        result = result * 2;
        result = result / 2;
        result = result + 8;
        result = result % 7;
    }

    void unary() {
        int result = +1;
        result--;
        --result;
        result++;
        ++result;
        result = -result;
        boolean success = false;
        boolean notSuccess = !success;
    }

    void equality() {
        int value1 = 1;
        int value2 = 2;
        if (value1 == value2)
            System.out.println("value1 == value2");
        if (value1 != value2)
            System.out.println("value1 != value2");
        if (value1 > value2)
            System.out.println("value1 > value2");
        if (value1 < value2)
            System.out.println("value1 < value2");
        if (value1 <= value2)
            System.out.println("value1 <= value2");
    }

    void condition() {
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if ((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }

    void typeOperator() {
        Object o1 = new Object();
        if (o1 instanceof Object) {
            // do something
        }
    }

    void bitwise() {
        int a = 1;
        int b = 2;

        a = a & b;
        a = a | b;
        a = a ^ b;
        a = ~a;
        a = a << 2;
        a = a >> 2;
        a = a >>> 2;
    }
}

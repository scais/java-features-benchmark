package fundamentals.variables;

public class Arrays {

    int[] arrayInt;
    int[][] matrixInt;
    String[] foosNotInitialized;
    String[] foosInitialized = { "foo1", "foo2", "foo3"};

    void doThingsWithArrays() {

        arrayInt = new int[10];
        matrixInt = new int[10][10];
        foosNotInitialized = new String[5];

        arrayInt[0] = 1;
        matrixInt[0][0] = 1;
        foosNotInitialized[0] = "foo1";

        foosInitialized[0] = foosNotInitialized[0];
    }

}

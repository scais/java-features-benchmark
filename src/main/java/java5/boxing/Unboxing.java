package java5.boxing;

import java.util.List;

public class Unboxing {

    void unbox1(List<Integer> integerList) {
        int sum = 0;
        for (Integer integer : integerList) {
            sum +=integer;
        }
    }

    void unbox2(List<Integer> integerList) {
        Integer integer = new Integer(1);
        int one = integer;
    }

}

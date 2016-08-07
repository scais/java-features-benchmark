package java5.loops;

import java.util.Arrays;
import java.util.List;

public class ForLoop {

    List<String> stringCollection = Arrays.asList(new String[]{"foo", "bar"});

    void improvedForLoop() {
        for (String string : stringCollection) {
            System.out.println(string);
        }
    }

}

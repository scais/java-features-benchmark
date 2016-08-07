package java5.varargs;

public class VariableArgumentList {

    void foo(String... param) {
        for (String text : param) {
            System.out.println(text);
        }
    }

}

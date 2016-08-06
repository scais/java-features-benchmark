package fundamentals.controlflow;

public class Switch {

    int switchWithDefaultAndBreak(int foo) {
        int result = 0;

        switch (foo) {
            default:
                result += 1;
                break;
            case '0':
                result += 1;
                break;
            case '1':
                result += 1;
                break;
        }

        return result;
    }

    int switchWithoutDefaultAndWithoutBreak(int foo) {
        int result = 0;

        switch (foo) {
            case '0':
                result += 1;
            case '1':
                result += 1;
        }

        return result;
    }

    int switchWithDefaultInside(int foo) {
        switch (foo) {
            case '0':
                return -1;
            default:
                return 42;
            case '1':
                return -2;
        }
    }

    int switchInsideSwitch(int foo, int bar) {
        switch (foo) {
            case '0':
                switch (bar) {
                    case '0':
                        return -3;
                }
            case '1':
                return -2;
        }
        return 0;
    }

}

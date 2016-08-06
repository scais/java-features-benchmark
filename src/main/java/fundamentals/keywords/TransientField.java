package fundamentals.keywords;

import java.io.Serializable;

public class TransientField implements Serializable {

    public transient String password1;

    protected transient String password2;

    transient String password3;

    private transient String password4;

}

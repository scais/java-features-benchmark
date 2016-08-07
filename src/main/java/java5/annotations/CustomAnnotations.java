package java5.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;

/**
 * http://docs.oracle.com/javase/1.5.0/docs/guide/language/annotations.html
 */
public class CustomAnnotations {

    /**
     * Describes the Request-For-Enhancement(RFE) that led
     * to the presence of the annotated API element.
     */
    @Retention(RetentionPolicy.SOURCE)
    @Target(ElementType.METHOD)
    public @interface RequestForEnhancement {
        int id();
        String synopsis();
        String engineer() default "[unassigned]";
        String date() default "[unimplemented]";
    }

    @RequestForEnhancement(
            id = 2868724,
            synopsis = "Enable time-travel",
            engineer = "Mr. Peabody",
            date = "4/1/3007"
    )
    public static void travelThroughTime(Date destination) {
        // do Something
    }
}
//3
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface ToString {
    ShowField show() default ShowField.YES;

    enum ShowField {
        YES, NO
    }
}
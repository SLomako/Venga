package annitations;

import java.lang.annotation.*;

import io.qameta.allure.LabelAnnotation;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@LabelAnnotation(name = "ALLURE_MANUAL", value = "true")
public @interface Manual {
}

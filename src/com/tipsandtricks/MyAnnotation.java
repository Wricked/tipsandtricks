package com.tipsandtricks;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // How this Annotation will execute
@Target(ElementType.METHOD) // Where this annotation is applied.
public @interface MyAnnotation {
    int value();
}

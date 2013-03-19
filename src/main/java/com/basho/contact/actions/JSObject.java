package com.basho.contact.actions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface JSObject {
    String jsName() default "";
    boolean returnValue() default false;
}

package org.java_tutorials.tuition.shahir.part_1.tutorials_7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();

}

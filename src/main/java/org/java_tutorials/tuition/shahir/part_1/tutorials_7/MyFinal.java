package org.java_tutorials.tuition.shahir.part_1.tutorials_7;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyFinal {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        var meta=Meta.class;
        Method[] methods=meta.getMethods();
        newInterface.class.getMethod("fun1").invoke((newInterface) () -> System.out.println("Run time call"));
        System.out.println(Arrays.toString(methods));
        System.out.println(Arrays.toString(MyMain.class.getMethods()));
        System.out.println(MyMain.class.getMethods().length);
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyAnno.class)){
            System.out.println(method.getAnnotation(MyAnno.class).str());
            System.out.println(method.getAnnotation(MyAnno.class).val());
            }
        }
    }
}


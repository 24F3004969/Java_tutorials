package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

import java.beans.*;
import java.io.*;

public class IntrospectorDemo{
    public static void main(String[] args) {
        try {
            var c=Class.forName("Colors");
            var objectOutputStream=new ObjectOutputStream(new FileOutputStream("serial"));
            objectOutputStream.writeObject(c);
            var  beanInfo= Introspector.getBeanInfo(c);
            System.out.println("Properties:");
            var propertyDescriptor=beanInfo.getPropertyDescriptors();
            for(var property:propertyDescriptor)
                System.out.println(property.getName());
            System.out.println("Events:");
            var eventSetDescriptor=beanInfo.getEventSetDescriptors();
            for(var event:eventSetDescriptor)
                System.out.println(event.getClass().getName());
            var objectInputStream=new ObjectInputStream(new FileInputStream("serial"));

        } catch (ClassNotFoundException | IntrospectionException | IOException e) {
            e.printStackTrace();
        }
    }
}

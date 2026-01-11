package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Objects;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
class User{
    public static void main(String[] args) {
        Person person=new Person("helal",56);
        Person person1=new Person("helal",56);
        System.out.println(person1==person);
    }
}

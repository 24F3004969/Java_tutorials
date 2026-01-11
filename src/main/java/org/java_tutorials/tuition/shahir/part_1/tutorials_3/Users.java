package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

import java.io.Serializable;
import java.util.UUID;

public record Users(UUID userID,String name,int age,Gender gender) implements Serializable {
    public enum Gender {
        Male,Female
    }
}

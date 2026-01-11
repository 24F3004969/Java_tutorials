package org.java_tutorials.dsa.util;

public record Element<T extends Number>(T value, int index) {
}
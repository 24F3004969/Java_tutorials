package org.java_tutorials.dsa.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author hilal on 01-02-2023
 * @project Java_tutorials
 */
public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(5,"ds");
        m.put(15,"ds");
        m.put(50,"ds");
        m.put(-5,"ds");
        m.put(59,"ds");
        System.out.println(m);
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.putAll(m);
        System.out.println(m);
    }
}

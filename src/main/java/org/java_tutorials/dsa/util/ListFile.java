package org.java_tutorials.dsa.util;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ListFile {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\hilal\\Pictures\\VSCodeImages");
        var list=file.listFiles();
        for(File f: Objects.requireNonNull(list)){
            System.out.printf("%sfile:///C:/Users/hilal/Pictures/VSCodeImages/%s%s,\n",'"', f.getName(),'"');
        }
    }
}

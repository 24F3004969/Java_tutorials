package org.java_tutorials.tuition.shahir.part_1.tutorials_11;
/* A simple telephone number database that uses
a property list. */
import java.io.*;
import java.util.*;
class Phonebook {
    public static void main(String[] args) throws IOException
    {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;
// Try to open phonebook.dat file.
        try {
            fin = new FileInputStream("phoneBook.dat");
        } catch(FileNotFoundException e) {
// ignore missing file
        }
/* If phonebook file already exists,
load existing telephone numbers. */
        try {
            if(fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch(IOException e) {
            System.out.println("Error reading file.");
        }
// Let user enter new names and numbers.
        do {
            System.out.println("Enter new name" +
                    " ('quit' to stop): ");
            name = br.readLine();
            if(name.equals("quit")) continue;
            System.out.println("Enter number: ");
            number = br.readLine();
            ht.put("Number",number);
            ht.put("Name", name);
            changed = true;
        } while(!name.equals("quit"));
// If phone main.java.org.jmath.tutorials_1 data has changed, save it.
        if(changed) {
            FileOutputStream fout = new FileOutputStream("phoneBook.dat");
            ht.store(fout, "Telephone Book");
            fout.close();
        }
// Look up numbers given a name.
        do {
            System.out.println("Enter name to find" +
                    " ('quit' to quit): ");
            name = br.readLine();
            if(name.equals("quit")) continue;
            number = (String) ht.get("Number");
            System.out.println(number);
        } while(!name.equals("quit"));
    }
}
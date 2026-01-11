package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

import java.io.*;
import java.util.UUID;

public class SerializationDemo
{
   public static void main(String ...args){
       //Serialization
       try (var objectOutputStream= new ObjectOutputStream(new FileOutputStream("serial"))){
           objectOutputStream.writeObject(new Users(UUID.randomUUID(),"Helal Anwar",22, Users.Gender.Male));
       } catch (IOException e) {
           e.printStackTrace();
       }
       //DSerialization
       try (var objectInputStream =new ObjectInputStream(new FileInputStream("serial"))){
        Users users=(Users) objectInputStream.readObject();
           System.out.println("User id : "+users.userID());
           System.out.println("User name : "+users.name());
           System.out.println("User age : "+users.age());
           System.out.println("User gender : "+users.gender());
       } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
       }
   }
}

package org.java_tutorials.tuition.shahir.part_1.tutorials_11;

public class NewThread implements Runnable {
    Thread thread;
    NewThread(){
        thread=new Thread(this,"Demo Thread");
        System.out.println("The child thread is "+thread);
    }
    @Override
    public void run() {
          try
          {
           for (int i=5;i>0;i--){
               System.out.println("Child thread :"+i);
               Thread.sleep(500);
           }
          }
          catch (Exception e) {
              e.printStackTrace();
          }
        System.out.println("Exit of thread");
    }
}

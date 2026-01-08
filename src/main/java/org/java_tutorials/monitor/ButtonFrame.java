package org.java_tutorials.monitor;
class TicketMyshow implements Runnable{
    int available = 10;
    int wanted;
    public TicketMyshow(int w) {
        wanted = w;
    }
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        System.out.println("AvailableTickets : " + available + " Wanted : "+wanted);
        if (wanted <= available){
            System.out.println(name+" booked " + wanted + " tickets");
            available = available - wanted;
        }
        else{
            System.out.println("Sorry no tickets for " + name);
        }
    }
}
class BookTicket{
    public static void main(String[] args){
        TicketMyshow ticket = new TicketMyshow(5);
        Thread thread1 = new Thread(ticket,"Jock");
        thread1.start();
        Thread thread2 = new Thread(ticket, "John");
        thread2.start();
        Thread thread3 = new Thread(ticket, "Virat");
        thread3.start();
    }
}

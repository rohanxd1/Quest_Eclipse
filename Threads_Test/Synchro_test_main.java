package Threads_Test;
public class Synchro_test_main extends Thread 
{
    int seat;
    static TicketBooking b1 = new TicketBooking();

    public Synchro_test_main(int seat) 
    { 
        this.seat = seat;
    }

    public void run() {
        b1.book(seat);
    }

    public static void main(String args[]) 
    {
        Synchro_test_main p1 = new Synchro_test_main(30);
        Synchro_test_main p2 = new Synchro_test_main(10);
        
        p1.start();
        p2.start();
    }
}
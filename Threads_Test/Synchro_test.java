package Threads_Test;

public class Synchro_test {

}
class TicketBooking
{
	int maxseat=34;
	synchronized void book(int seat)
	{
		if(maxseat>=seat)
		{
			System.out.println("Seat Booked");
			maxseat-=seat;
			System.out.println("Seat left:"+maxseat);
		}
		else
		{
			System.out.println("Booking cancelled due to insuffienct seats left\nSeats remaining:"+maxseat);
		}
	}
}

package Collections_Study;
import java.util.*;
public class Array_Dequeue_test 
{public static void main(String[] args) 
	{
	 Deque d = new ArrayDeque<Integer>();
	 d.add(10);
	 d.add(20);
	 d.add(50);
	 System.out.println(d);
	 System.out.println(d.peekFirst());
	 System.out.println(d.peekLast());
	 d.addFirst(25);
	 System.out.println(d);
//	 offer
//	 poll
//	 remove
	 Iterator descendingiterator =d.descendingIterator();//for study purposes
	 while(descendingiterator.hasNext())
	 {
		 System.out.println(descendingiterator.next());
	 }
	}

}

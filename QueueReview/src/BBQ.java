import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BBQ {

	public static void main(String[] args) {

		Queue<String> bbqLine = new LinkedList<String>();
		
		bbqLine.add("Jackson");
		bbqLine.add("Tyreek");
		bbqLine.add("Sue");
		bbqLine.poll(); //Remove next person in line
		System.out.println(bbqLine);
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		System.out.println(q.poll()); // q.poll is used to remove element

	}

}

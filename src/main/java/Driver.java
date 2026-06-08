import org.example.java;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current increament:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current decrement:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}

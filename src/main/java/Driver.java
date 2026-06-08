import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		Counter counter2 = new Counter(); 
		int x = 0; 
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment(); 
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
		if (false) {
			System.out.println("ini tidak akan pernah dieksekusi");
		}
		
	}

}

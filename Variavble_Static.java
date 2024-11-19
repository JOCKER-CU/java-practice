public class Variavble_Static{
	public static void main(String []args){

		Counter c1 = new Counter();
		
		c1.countUp();
		System.out.println("firs" + c1.count);
		Counter c2 = new Counter();
		System.out.println("Second" + c2.count);
		c2.countUp();

		System.out.println("c1 " + c1.count);
		System.out.println("c2 " + c2.count);
	}


}

class Counter {
	static int count;

	public void countUp(){
		System.out.println(count);
		count ++;
		System.out.println(count);
	}
}
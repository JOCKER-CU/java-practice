

class BranchingDemo {
	public static void main(String[] args) {
		test();
	}

	static void test(){
		label:
		for(int x = 0; x < 5; x++){
			System.out.println("Outer loop : " + x);
			
			for(int y = 0; y < 5; y++){
				if( y == 3){
					//return;
					//break label;
					continue label;
				}
				System.out.println(" Inner loop : " + y);
			}
			System.out.println();
		}
		System.out.println("Finish");

	}
}
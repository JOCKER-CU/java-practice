class WhileLoop{
	public static void main(String[] args) {
	 run();	
	}

	static void run(){
		whileLoopStmt();
		dowhileLoopStmt();
	}

	static void whileLoopStmt(){
		boolean flag = true;
		int number = 0;

		while(flag){
			if(number == 7){
				flag = false;
			}
			System.out.println(number);
			number ++;
		}
	}

	static void dowhileLoopStmt(){
		boolean flag = true;
		int number = 0;
		do {
			if(number == 5) {
				flag = false;
				System.out.println(number);
				number++;
			}
		}while (flag);

	}
}
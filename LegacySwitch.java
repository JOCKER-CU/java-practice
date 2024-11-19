class LegacySwitch {
	public static void main(String[] args) {
		run();
	}

	static void run(){
		switchStmt(2);
	}

	static void switchStmt(int code){
		int result = 0;
		switch(code){
		case 1 : 
			result = 10 + code;
			System.out.println("Result " + result );
			break;
		case 2 : 
			result = 20 + code;
			System.out.println("Result " + result);
			break;
		case 3 : 
			result = 30 + code;
			System.out.println("Result " + result);
			break;
		default : 
			System.out.println("Sorry");
		}
	}

}
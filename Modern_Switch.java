class Modern_Switch{
	public static void main(String[] args) {
		run();
	}
	static void run(){
		int value = modern_Switch_Stmt(1);
		System.out.println("Result " + value);
	}
	static int modern_Switch_Stmt(int code){
		return switch(code){
		case 1:
			yield 10 + code;
		case 2:
			yield 20 + code;
		case 3:
			yield 30 + code;
		default:
			throw new IllegalArgumentException();
		};
	}
}
class Human{
	
	public static void main(String[] args) {
		String s = "Sue";
		setName(s);
		String result = getName();
		System.out.println(result);
	}
	static void setName(String name){
		System.out.println(name);
	}

	static String getName(){

		return "William";
	}
}
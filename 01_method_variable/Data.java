class Data{
	static String staticName;
	String instanceName;

	{
		System.out.println("Instance block");
	}
	static{
		System.out.println("static block");
	}

	Data(){
		System.out.println("Using Constructor");
	}
	static void staticMethod(String instanceName){

		// Data d = new Data();
		// staticName = "Andrew";
		// d.instanceName = "Sopheia";

		// System.out.println(staticName);
		// System.out.println(d.instanceName);
		// d.instanceMethod();
	}

	void setName(String n){
		instanceName = n;
	}
	void instanceMethod(String instanceName){
		System.out.println(instanceName);
		//staticMethod();
		//Data d = new Data();
		// staticName = "Andrew";
		// instanceName = "Sopheia";

		// System.out.println(staticName);
		// System.out.println(instanceName);
	}
}
public class Car{
	String model;
	String type;

	Car(String type, String model){
		this.type = type;
		this.model = model;
	}

	public void showInfo(){
		System.out.println("Model : " + model );
		System.out.println("Type  : " + type );
	}
}
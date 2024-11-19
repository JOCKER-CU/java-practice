import java.util.Scanner;

public class Studentdata{
	static Scanner sc;
	static String [][] std = new String[0][0];
	public Student stud;

	public void enterInfo(){
		stud = new Student();
		sc = new Scanner(System.in);
		String name = "";
		String town = "";
		String op = "";
		do {
			System.out.print("Enter Student Name : ");
			name = sc.nextLine();
			System.out.print("Enter Township : ");
			town = sc.nextLine();

			stud.setName(name);
			stud.setTownship(town);
			setStdData(stud.getName(), stud.getTownship());

			System.out.print("Exit it or not ? ");
			op = sc.nextLine();

		}while(!"Y".equalsIgnoreCase(op));
	}

	public void setStdData(String name, String town){
		String [][] temp = new String[std.length + 1][std.length + 1];
		for(int i = 0; i < std.length; i++){
			for(int j = 0; j < std[i].length; j++ ){
				temp[i][j] = std[i][j];
			}
			temp[i][std.length + 1] = name; 
			temp[i][std.length + 1] = town; 
			std = temp;

		}
	}

	public void getStdData(){
		for(int i = 0; i < std.length; i++){
			for(int j = 0; j < std[i].length; j++){
				System.out.println("***" + std[i][j] + "***");
			}
		}
	}

}
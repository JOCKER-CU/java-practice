import java.util.*;
class ArrayDemo {
	static String[] names = new String[0];
	static Scanner sc;
	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		 askNameAndIndex();

		 showNames();

		 
	}


	static void askNameAndIndex(){
		String ask = "";
		do {
			System.out.print("Type Name : ");
			String name = sc.next();
			System.out.println();
			System.out.println("Do you want more : ");
			ask = sc.next();
		 	setName(name);
		}while("y".equals(ask));
		//for(int i = 0; i < names.length; i ++){
			
		//}

		
	}
	static void setName(String name){
		
		String temp[] = new String[names.length + 1];
		for(int i = 0; i < names.length; i++){
			temp[i] = names[i];
		}
			temp[names.length + 1] = name;
			System.out.println("3. " +names.length);
			names = temp;

			// names = Arrays.copyOf(names, names.length + 1);
			// System.out.println("2. " + names.length);
			// names[names.length - 1] = name;
			// System.out.println("3. " +names.length);

			
		
	}

	// static void setName(int i, String name){
	// 	names[i] = name;
	// }

	static void showNames(){
		for(String nam : names){
			System.out.println("Names : " + nam);
		}
	}
}
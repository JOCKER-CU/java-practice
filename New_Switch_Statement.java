import java.util.Scanner;

public class New_Switch_Statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String decision = null;

		do {
			System.out.print("Enter a Number : ");
			String str = sc.nextLine();

			int data = Integer.valueOf(str);
			newSwitch(data);

			System.out.print("Exit or not  Y/N ? : ");
			decision = sc.nextLine();

		}while(!"Y".equalsIgnoreCase(decision));
	}

	static void newSwitch(int data){

		// switch(data){
		// case 0 -> System.out.println("this is zero.");
		// case 1 -> System.out.println("this is one.");
		// case 2 -> System.out.println("this is two.");
		// default -> System.out.println("this is default");
		// }

		String ans = switch(data){
		case 0 -> {
			yield "this is zero.";
		}
		case 1 ->{
		 yield "this is one.";
		}
		case 2 -> {
			yield "this is two.";
		}
		default -> {
			yield "this is default";
		}
		};
		System.out.println(ans);
	}
}
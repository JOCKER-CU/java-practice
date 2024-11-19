import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String decision = null;

		do{
			System.out.println("Enter a Number : ");
			int num = sc.nextInt();
			demo(num);

			System.out.println("Do U want to exit ? Y/N ");
			decision = sc.next();
		}while(!"Y".equalsIgnoreCase(decision));
	}
	// Old switch Statement
	static void demo(int data){
		switch(data){
		case 0:
			System.out.println("this is zero.");
			break;
		case 1:
			System.out.println("this is one.");
			break;
		case 2:
			System.out.println("this is two.");
			break;
		case 3:
			System.out.println("this is three.");
			break;
		default:
			System.out.println("This is default.");
		}

		
	}
}
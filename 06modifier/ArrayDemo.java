
import java.util.*;
//class, import , comment, documentation comment , package statement;

// Hello comment
 /*
 *
 *documentation comment or multi Line comment
 *
 */

public class ArrayDemo{
	static String name;
	public static void main(String arg[]){
	
		int[] ary = new int[10];

		ary[0] = 111;
		ary[1] = 31;
		ary[2] = 51;
		ary[3] = 61;
		ary[4] = 15;
		ary[5] = 99;
		ary[6] = 70;
		ary[7] = 53;
		ary[8] = 3;
		

		System.out.println("Before Reassign " + java.util.Arrays.toString(ary));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to Find : ");
		int numToFind = sc.nextInt();

		System.out.println(numToFind);

		for(int i = ary.length - 1 ; ary.length > -1; i--){

			if(numToFind == ary[i]){
				System.out.println(i + " number is " + ary[i]);
				break;
			}
			System.out.println("hello Break is responding");
			
		}
		System.out.println("outer For loop");
	
	 }
	
	}



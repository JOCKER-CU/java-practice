import java.util.Scanner;

class ArrayDemoTwo{
	static Scanner sc;
	static int[] array;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		addToArray();	
		askOp();
		getAllArray();	
	}

	static void askOp(){
		int re = 0; 
	
		System.out.println("""
			Select Operation By Type Number
				1. update Array
				2. delete Array
			""");
		re = sc.nextInt();
		System.out.println("Enter Array index : ");
		int index = sc.nextInt();
		switch(re){
		case 1 -> {
			System.out.println("Enter Value : " );
			int newValue = sc.nextInt();
			updateArray(index,newValue);
		}
		case 2 -> {
			 deleteByArrayIndex(index);
		}
		default -> {
			System.out.println("Sorry, I can't catch you");
		}
		}
	}

	static void updateArray(int index, int newValue){
		array[index] = newValue;

	}
	static void deleteByArrayIndex(int index){
		int temp[]  = new int[array.length - 1];
		int j = 0;
		System.out.println("Size" + temp.length);
		for(int i = 0; i < array.length; i++){
			if(index == i){
				continue;
			}else{
				
				if(j < temp.length){
					temp[j++] = array[i];				
				}
			}		
		}
		array = tSystem.out.println("Type array lenght ");emp;

		
	}

	static void addToArray(){
		System.out.println("Type array lenght ");
		int i = sc.nextInt();
		array = new int[i];
		for(int x = 0; x < array.length; x++){
			array[x] = x + 5;
		}
	}

	static void getAllArray(){
		for(int x = 0; x < array.length; x++){
			System.out.println("Values : " + array[x]);
		}
		System.out.println(" array lenght " + array.length);
	}
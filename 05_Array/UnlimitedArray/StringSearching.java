import java.util.*;
class StringSearching{
	public static void main(String[] args) {
		String str = "Java is amazing!";
		char[] ch = str.toCharArray();
		int[] data = searchIndex(str, 'a');

		for(int d : data){
			System.out.print(d + ",");
		}


	}

	static int[] searchIndex(String str, char c){
		int index = -1;
		int [] array = {};

		while((index =  str.indexOf(c,index + 1)) >= 0){
			array = Arrays.copyOf(array, array.length + 1);
			array[array.length - 1] = index;
		}
		return array;
	}	
}


class BinarySearchTree{

	public static void main(String[] args) {
		
		int[]  ints = {1, 2, 3, 4, 5, 7, 9, 12, 14};

		System.out.println(binarySearch(ints, 1));

	}

	private static int binarySearch(int[] ints, int numToFind){
		int low = 0;
		int high = ints.length -1;

		while( low <= high ) {
			int middlePosition = (low + high) / 2;
			int middleNumber = ints[middlePosition];

			if( numToFind == middleNumber ){
				return middlePosition;
			}

			if( numToFind < middleNumber ){
				high = middlePosition - 1;
			} else {
				low = middlePosition + 1;
			}
			
		}
		return -1;
	}
}
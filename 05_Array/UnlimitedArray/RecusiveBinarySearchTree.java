
class RecusiveBinarySearchTree{

	public static void main(String[] args) {
		
		int[]  ints = {1, 2, 3, 4, 5, 7, 9, 12, 14};

		System.out.println(recursivebinarySearch(ints, 12, 0, ints.length));
		System.out.println(recursivebinarySearch(ints, 2, 0, ints.length));
		System.out.println(recursivebinarySearch(ints, 100, 0, ints.length));
		System.out.println(recursivebinarySearch(ints, 5, 0, ints.length));

	}

	private static int recursivebinarySearch(int[] ints, int numToFind, int low, int high){
		
		if(low <= high && low <= ints.length - 1) {
			int middlePosition = low +( high - low ) / 2;
			int middleNumber = ints[middlePosition];

			if( numToFind == middleNumber ){
				return middlePosition;
			}

			if( numToFind < middleNumber ){
				return recursivebinarySearch(ints, numToFind, low, middlePosition - 1);
			} else {
				return recursivebinarySearch(ints, numToFind, middlePosition + 1, high);
			}
			
		}
		return -1;
	}
}
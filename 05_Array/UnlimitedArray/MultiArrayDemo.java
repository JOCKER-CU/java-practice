class MultiArrayDemo{

	public static void main(String[] args) {
		int[][] arr = {{2,3},{4,5,6},{8,9}};
		showArrayWithWhile(arr);		
	}

	static void showArrayWithWhile(int[][] arr){
		
		int x = 0;
		
		while(x < arr.length){
			int y = 0;
			while(y < arr[x].length){
				System.out.println("Value => " + arr[x][y]);
				y++;
			}
			
			x++;
		}
	}

	static void showArrayWithFor(int[][] arr){

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println("Value =>" + arr[i][j]);
			}
		}
	}

}
class PrimitivetoString{

	public static void main(String[] args) {
		var data = 12;
		System.out.println(data);
		//directly can't assign integer value to String value
		// String str = data;
		// System.out.println(str);
		Integer data1 = data;
		System.out.println(data1);

		//can assign integer value to String with String.valueOf() method
		String str = String.valueOf(data);
		System.out.println(str);

	}
	
}
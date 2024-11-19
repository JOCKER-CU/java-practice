public class Octal_Number {
	public static void main(String[] args) {
		for(String str : args){
			literalNum(str);
		}

	}

	static void literalNum(String str){
		int num = Integer.parseInt(str);
		String octal = integerLiteralMethod(num, 8);

		System.out.printf("Decimal number of %d is %s. %n", num, octal);
		System.out.printf("Octal Number of %s is %d. %n",octal, Integer.valueOf(octal, 8));

		String hex = integerLiteralMethod(num, 16);

		System.out.printf("Decimal number of %d is %s.%n", num, hex);
		System.out.printf("Octal Number of %s is %d. %n",hex, Integer.valueOf(hex, 16));
	}

	static String integerLiteralMethod(int data, int format){
		StringBuilder str = new StringBuilder();

		while(data > 0){
			int remain = data%format;
			str.append( format == 16 ? getHex(remain) : remain);
			data = (data/format );
		}
		str.reverse();
		//str.insert(0, getPrefix(format));
		return str.toString();
	}

	static String getHex(int value){
		String [] values ={"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		return values[value];
	}

	static String getPrefix(int format){
		String prefix = null;
		switch(format){
		case 2:
			prefix = "0b";
			break;
		case 8:
			prefix = "0";
			break;
		case 16:
			prefix = "0x";
			break;
		default:
			break;
		}
		return prefix;
	}
}
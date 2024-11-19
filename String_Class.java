public class String_Class{
	public static void main(String[] args) {
		String name = "Maung Maung";
		//name = "Aung Aung";

		String hello = name;

		String aye = new String("Aye Aye");
		String aung = new String("Aung Aung");
		aung = name;

		System.out.println(aung);
		System.out.println(name == aung);
		System.out.println(aye);
		System.out.println(name);
		System.out.println(hello);
		System.out.println(name == hello);
	}
}
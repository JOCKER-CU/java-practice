public class Method_Overloading {
	public static void main(String[] args) {
		
		Paper paper = new Paper();
		Notebook note = new Notebook();

		takeNote("Hell Java", paper);
		System.out.println(paper.message);


	}

	static void takeNote(String message, Paper paper){
		paper.message = message;
	}

	static void takeNote(String message, Notebook note){
		note.message = message;
	}
}

class Paper{
	String message;
}

class Notebook {
	String message;
}
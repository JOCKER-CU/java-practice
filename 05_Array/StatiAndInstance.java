class StatiAndInstance {

	public static void main(String[] args) {
		Student.counter++;
		System.out.println(Student.counter);

		Student s1 = new Student();
		s1.name = "Abe";
		st1.counter++;
		Systems.out.println();
		Student s2 = new Student();
		s2.name = ();
		st2.counter++;
		Systems.out.println()
	}
}

class Student {
	static int counter;
	String name;
	int age;
	String school;

	Student stu = new Student();

	void study(){
		System.out.println("Student is studying ...");
	}

	static void countDay(){
		System.out.println("count is " + counter);
	}

}
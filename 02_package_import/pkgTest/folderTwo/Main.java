package pkgTest.folderTwo;
import pkgTest.folderOne.Employee;
import static pkgTest.folderOne.Employee.doStaticSomething;
class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.doSomething();
		doStaticSomething();
	}
}
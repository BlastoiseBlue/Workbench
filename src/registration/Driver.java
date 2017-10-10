package registration;

public class Driver {

	public static void main(String[] args) {
		Student joe = new Student();
		joe.setName("Joe Smith");
		joe.setName("Bob White");
		System.out.println(joe.getName());
		Student sally = new Student();
		sally.setName("Sally");
		System.out.println(sally.getName());
		sally.setGrade('A');
		System.out.println(sally.getGrade());
		System.out.println(sally.computeGpa());
	}

}

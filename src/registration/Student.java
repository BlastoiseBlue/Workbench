package registration;

public class Student {
	String name;
	double gpa;
	String major;
	String courseTaken;
	char grade;

	public void setName(String someName) {
		if (name != null)
			return;
		name = someName;
	}

	public void setGrade(char someGrade) {
		grade = someGrade;
	}

	public String getName() {
		return name;
	}

	public char getGrade() {
		return grade;
	}

	public double computeGpa() {
		switch (grade) {
		case 'A':
			return 4.0;
		case 'B':
			return 3.5;
		case 'C':
			return 3.0;
		default:
			return 0.0;
		}
	}
	public void register(String course, String prof) {
		courseTaken=course;
	}
	public void register(int CRN) {
		//
	}

	public void printRecord() {
		System.out.println(name);
		System.out.println(gpa);
		System.out.println(major);
	}
}

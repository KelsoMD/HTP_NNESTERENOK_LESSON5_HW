package by.htp.university;

public class MainApp {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		int x =0;
		x=3;
		
		Student stud1 = null;
		stud1 = new Student();
		Student stud2 = new Student();
		System.out.println();
		
		stud1.age = 23;
		stud1.name = "Alex";
		stud1.surname = "Nesterenok";
		stud1.enterYear = 2015;
		stud2.age = 21;
		stud2.name = "Anna";
		stud2.surname = "Ivanova";
		stud2.enterYear = 2014;
		Student stud3 = new Student();
		Student stud4 = new Student();
		Student stud5 = new Student();
		System.out.println();
		
		System.out.println("One year later...");
		Group group = new Group(17);
		group.students[0] = stud1;
		group.students[1] = stud2;
		group.students[2] = stud3;
		group.students[3] = stud4;
		group.students[4] = stud5;
		System.out.println();
		group.meetNewStudent();
		System.out.println();
		System.out.println("Avarege age is "+group.calculateAvgAge());
		System.out.println("Year is "+group.demographyBOOM());
		System.out.println("Entered in 2015: "+group.count2015());
	}
}

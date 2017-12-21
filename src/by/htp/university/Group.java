package by.htp.university;

public class Group {
	static int numberCount = 0;
	Student students[];
	int number;

	public void meetNewStudent() {
		System.out.println("Hello!");
	}

	public int calculateAvgAge() {
		int count = 0;
		int avgAge = 0;
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				sum = sum + students[i].age;
				count++;
			}
		}
		avgAge = sum / count;
		return avgAge;
	}

	public int demographyBOOM() {
		int year = 0;
		int resYear = 0;
		int maxCount = 0;
		int count = 0;
		int resCount = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				count = 0;
				year = students[i].enterYear;
				for (int j = 0; j < students.length; j++) {
					if (students[j] != null) {
						if (students[j].enterYear == year) {
							count++;
						}
					}
				}
				if (count > maxCount) {
					resYear = year;
					resCount = count;
				}
			}
		}
		System.out.println("Number of Students " + resCount);
		return resYear;
	}

	public int count2015() {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].enterYear == 2015) {
					count++;
				}
			}
		}
		return count;
	}

	public Group(int groupSize) {
		if (groupSize>=5 && groupSize<=15) {
			this.students = new Student[groupSize];
		}
		if (groupSize<5) {
			System.out.println("Sorry, minimal number of students in group is 5.\nThe group of 5 students was formed.");
			this.students = new Student[5];
		}
		if (groupSize>15) {
			System.out.println("Sorry, maximum number of students in group is 15.\nThe group of 15 students was formed.");
			this.students = new Student[15];
		}
	}
}

package enrolsystem

class Course {

	String department;
	String courseTitle;
	Lecturer courseLeader;
	String courseCode;

	Date startDate;
	Date endDate;
	String description;
	int numberOfStudents;
	double tuitionFees;
	String studyMode;
	String toString(){
	return courseTitle
	}

	static hasMany=[lecturers: Lecturer]

    static constraints = {

	department nullable: false, blank: false
	courseTitle nullable: false, blank: false
	courseLeader nullable: false, blank: false
	courseCode nullable: false, blank: false

	startDate nullable: false, blank: false
	endDate nullable: false, blank: false
	description nullable: false, blank: false
	numberOfStudents nullable: false, blank: false, minSize: 20, maxSize: 60
	tuitionFees nullable: false, blank: false
	studyMode nullable: false, blank: false
    }
}

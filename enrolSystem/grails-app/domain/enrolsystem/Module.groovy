package enrolsystem

class Module {
	static belongsTo = Lecturer
	

	String module_title;
	String module_code;
	int credits;
	Lecturer lecturer;
	String description;
	



    static constraints = {

	module_title nullable: false, blank: false
	module_code nullable: false, blank: false
	credits nullable: false, blank: false, min: 20, max: 120
	lecturer nullable: false, blank: false
	description nullable: false, blank: false, maxSize: 5000

    }
}

package enrolsystem

class BootStrap {	

    def init = { servletContext ->

	def Course=new Course(
	department: 'Computing',
	courseTitle: 'Computing',
	courseLeader: 'Lynne Dawson',
	courseCode: 'G504',

	startDate:new Date('22/5/2020'),
	endDate:new Date('22/5/2025'),


	description: 'A nerd course',
	numberOfStudents:'30',
	tuitionFees: '9250.50',
	studyMode: 'full').save()




	new Course(
	department: 'Art',
	courseTitle: 'Art',
	courseLeader: 'Lynne Artsie',
	courseCode: 'G14',

	startDate:new Date('22/5/2020'),
	endDate:new Date('22/5/2025'),


	description: 'A Painter course',
	numberOfStudents:'30',
	tuitionFees: '9250.50',
	studyMode: 'full').save()


	new Course(
	department: 'Sport',
	courseTitle: 'Sport',
	courseLeader: 'Tim Sporty',
	courseCode: 'C17',

	startDate:new Date('22/5/2020'),
	endDate:new Date('22/5/2025'),


	description: 'A Running course',
	numberOfStudents:'30',
	tuitionFees: '9250.50',
	studyMode: 'full').save()


	def Lecturer=new Lecturer(
	fullName: 'Charles',
	post: 'Lecturer',
	subject: 'Wordpress',
	lecturerEmail: 'Charles@shu.ac.uk',
	office: 'Cantor - 9315',
	bio: 'Hi There, I teach wordpress' ).save()


	new Lecturer(
	fullName: 'Tondari',
	post: 'Senior Lecturer',
	subject: 'Web Analytics',
	lecturerEmail: 'Tondari@shu.ac.uk',
	office: 'Cantor - 9335',
	bio: 'Hi There, I teach Web Analytics' ).save()


	def Student=new Student(

	studentName: 'Nathan Fell',
	studentID: 'B8002391',
	dob: new Date('22/5/1998'),
	isFundingAvailable: 'Yes',

	studentEmail: 'B8002391@my.shu.ac.uk',
	studentUsername: 'B8002391',
	studentPassword: 'password',
	course: 'Computing' ).save()

	new Student(

	studentName: 'Sam Collett',
	studentID: 'B8005096',
	dob: new Date('3/7/2000'),
	isFundingAvailable: 'Yes',

	studentEmail: 'B8005096@my.shu.ac.uk',
	studentUsername: 'B8005096',
	studentPassword: 'password',
	course: 'Computing' ).save()


	def Module=new Module(

	module_title: 'Web Analytics',
	module_code: '617',
	credits: '20',
	lecturer: 'Mick',
	course: 'Computing',
	description: 'A fun web Development Module').save()

	new Module(
	module_title: 'Professional Computing Project',
	module_code: '371',
	credits: '40',
	lecturer: 'Charles',
	course: 'Computing',
	description: 'Well this module exists anyway').save()
	 

    }





    def destroy = {
    }
}

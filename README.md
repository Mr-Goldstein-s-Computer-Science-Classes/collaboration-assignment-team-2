Your task is to create a Gradebook class, a Student class, and a Main class

The Gradebook should contain some Students and assignments
The Student class should contain corresponding assignment names and grades

You can create other private methods, but the only public methods should be as listed below

Public Methods for Gradebook:
	Gradebook()
	void createStudent(String name)
	void addAssignment(String assignment)
	void gradeAssignment(String assignment, String studentName, double grade)
	double getAverageGrade(String assignment)
	double getMinimumGrade(String assignment)
	double getMaximumGrade(String assignment)
	double getAverageOverall()
	double getMaxOverall()
	double getMinOverall()
	double getStudentsGrade()
	String toString() -Returns the names of the students and the names of the assignments as a String
	Student getStudent(String studentName)

Public Methods for Student:
	Student(String name)
	void addAssignment(String assignName) //start as ungraded
	void gradeAssignment(String assignment, double grade)
	double getAssignmentGrade(String assignment)
	double getOverallGrade() //should ignore ungraded assignments
	String toString() -Return the Student name and the students average




Main:
Create a Gradebook object called grades
Create Students inside of grades
Tyler
James
Ethan
Scotty
David
Patrick
Create Assignments:
Stacks And Queues Station Activity
Stacks and queues programs
Stacks and queues quiz
Github Exploration
Grade Assignments:
Stacks and queues station
Tyler got a 94
James got a 14
Ethan got a 5
Scotty got a 100
David didn’t do it (0)
Patrick got a 79
Stacks and queues programs
Tyler got a 100
James got a 64
Ethan got a 100
Scotty got a 101
David got a 26
Patrick got a 99
Stacks and queues quiz
Tyler got a 100
James got a 100
Ethan got a 100
Scotty got a 87
David got a 92
Patrick got a 83
Github Exploration
Tyler got a 96
James got a 43
Ethan got a 100
Scotty got a 97
David got a 28
Patrick got a 100
Print out the stats for all assignments and overall grades
Print the grades object
Print the object of each student

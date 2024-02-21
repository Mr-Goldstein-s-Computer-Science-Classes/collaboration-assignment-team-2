import java.util.*;
public class Student {
private String student;
 private ArrayList<String> assignmentNames = new ArrayList<String>();
private ArrayList<Double> gradeDouble = new ArrayList<Double>();

public Student(String student){
    this.student = student;
}
    void addAssignment(String assignName){//start as ungraded
assignmentNames.add(assignName);
    }
    void gradeAssignment(String assignment, double grade){
    int tracker = 0;
for(int i = 0; i<assignmentNames.size();i++){
    if(assignmentNames())
}
    }
    double getAssignmentGrade(String assignment){

    }
    double getOverallGrade() {

    }

    String toString() { //Return the Student name and the students average

    }
}

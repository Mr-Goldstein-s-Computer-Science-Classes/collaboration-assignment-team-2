import java.util.*;
public class Student {
private String student;
 private ArrayList<String> assignmentNames = new ArrayList<String>();
private ArrayList<Double> gradeDouble = new ArrayList<Double>();

    public String getStudent() {
        return student;
    }

    public ArrayList<String> getAssignmentNames() {
        return assignmentNames;
    }

    public Student(String student){
    this.student = student;
}
    void addAssignment(String assignName){//start as ungraded
assignmentNames.add(assignName);
    }
    void gradeAssignment(String assignment, double grade){
    int tracker = 0;
for(int i = 0; i<assignmentNames.size();i++){
    if(assignmentNames.get(i).compareTo(assignment) == 0)
        tracker = i;
}
gradeDouble.add(tracker,grade);
    }
    double getAssignmentGrade(String assignment){
        int tracker = -1;
        for(int i = 0; i<assignmentNames.size();i++){
            if(gradeDouble.get(i) != null) {
                if (assignmentNames.get(i).compareTo(assignment) == 0)
                    tracker = i;
            }
        }
if(tracker == -1){
    System.out.println("This assignment is ungraded");
}
      return gradeDouble.get(tracker);
    }
    double getOverallGrade() {
    double totalGrades = 0;
for(int i =0;i<gradeDouble.size();i++){
    totalGrades += gradeDouble.get(i);
}
return totalGrades/gradeDouble.size();
    }

    public String toString() { //Return the Student name and the students average
return student + " " + getOverallGrade();
    }
}

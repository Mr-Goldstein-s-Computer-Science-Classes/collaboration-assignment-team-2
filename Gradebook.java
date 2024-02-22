import java.util.ArrayList;

public class Gradebook {

    private String gradebook;
    private ArrayList<Student> names = new ArrayList<>();

    public Gradebook(){

    }
    public void createStudent(String name){
Student student = new Student(name);
        names.add(student);
    }
    public void addAssignment(String assignment){
for(int i = 0; i<names.size();i++){
    names.get(i).addAssignment(assignment);
}

    }
    public void gradeAssignment(String assignment, String studentName, double grade){
for(int i = 0;i<names.size();i++){
    if(names.get(i).equals(studentName))
       names.get(i).gradeAssignment(assignment, grade);

}
    }
    public double getAverageGrade(String assignment){
        double averageGrade = 0;
for(int i = 0;names.size()<0;i++){
    double grade = names.get(i).getAssignmentGrade(assignment);
    averageGrade += grade;
}
return averageGrade/names.size();

    }
    public double getMinimumGrade(String assignment){
        double minimumGrade = 101;
        for(int i = 0;i<names.size();i++){
            if(names.get(i).getAssignmentGrade(assignment) < minimumGrade)
                minimumGrade =names.get(i).getAssignmentGrade(assignment);
        }
        return minimumGrade;
    }
    public double getMaximumGrade(String assignment){
        double maximumGrade = -1;
        for(int i = 0;i<names.size();i++){
            if(names.get(i).getAssignmentGrade(assignment) > maximumGrade)
                maximumGrade =names.get(i).getAssignmentGrade(assignment);
        }
        return maximumGrade;
    }
    public double getAverageOverall(){
double averageOverall = 0;
        for(int i = 0;i<names.size();i++){
          double studentsOverall =  names.get(i).getOverallGrade();
          averageOverall += studentsOverall;
        }
        return averageOverall/names.size();
    }
    public double getMaxOverall(){
        double maxOverall = -1;
        for(int i = 0;i<names.size();i++){
            if(names.get(i).getOverallGrade() > maxOverall)
                maxOverall = names.get(i).getOverallGrade();

        }
        return maxOverall;
    }
    public double getMinOverall(){
        double minOverall = 101;
        for(int i = 0;i<names.size();i++){
            if(names.get(i).getOverallGrade() < minOverall)
                minOverall = names.get(i).getOverallGrade();

        }
        return minOverall;
    }
   public double getStudentsGrade(String studentName){
        double studentsGrade = 0;
for(int i = 0;i<names.size();i++){
    if(names.get(i).equals(studentName))
        studentsGrade = names.get(i).getOverallGrade();
}
return studentsGrade;
   }
    public String toString(){
        String toString = "Student names ";
for(int i = 0;i<names.size();i++){
    toString += names.get(i);
    toString += " ";
}
toString += " Assignment names";
        for(int i = 0;i<names.size();i++){
            toString += names.get(i).getAssignmentNames();
            toString += " ";
        }
        return toString;
    }
    public Student getStudent(String studentName){
        Student student = new Student("this student is not in the gradebook");
for(int i =0; i<names.size();i++){
    if(names.get(i).getStudent().equals(studentName))
       student = names.get(i);
}
return student;
    }
}

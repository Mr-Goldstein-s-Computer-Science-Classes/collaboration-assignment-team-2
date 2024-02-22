import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Gradebook grades = new Gradebook();

            grades.createStudent("Tyler");
            grades.createStudent("James");
            grades.createStudent("Ethan");
            grades.createStudent("Scotty");
            grades.createStudent("David");
            grades.createStudent("Patrick");

            grades.addAssignment("StacksAndQueuesActivity");
            grades.addAssignment("StacksAndQueuesProgram");
            grades.addAssignment("StacksAndQueuesQuiz");
            grades.addAssignment("GithubExploration");

            grades.gradeAssignment("StacksAndQueuesActivity", "Tyler", 94);
            grades.gradeAssignment("StacksAndQueuesActivity", "James", 14);
            grades.gradeAssignment("StacksAndQueuesActivity", "Ethan", 5);
            grades.gradeAssignment("StacksAndQueuesActivity", "Scotty", 100);
            grades.gradeAssignment("StacksAndQueuesActivity", "David", 0);
            grades.gradeAssignment("StacksAndQueuesActivity", "Patrick", 79);

            grades.gradeAssignment("StacksAndQueuesProgram", "Tyler", 100);
            grades.gradeAssignment("StacksAndQueuesProgram", "James", 64);
            grades.gradeAssignment("StacksAndQueuesProgram", "Ethan", 100);
            grades.gradeAssignment("StacksAndQueuesProgram", "Scotty", 101);
            grades.gradeAssignment("StacksAndQueuesProgram", "David", 26);
            grades.gradeAssignment("StacksAndQueuesProgram", "Patrick", 99);

            grades.gradeAssignment("StacksAndQueuesQuiz", "Tyler", 100);
            grades.gradeAssignment("StacksAndQueuesQuiz", "James", 100);
            grades.gradeAssignment("StacksAndQueuesQuiz", "Ethan", 100);
            grades.gradeAssignment("StacksAndQueuesQuiz", "Scotty", 87);
            grades.gradeAssignment("StacksAndQueuesQuiz", "David", 92);
            grades.gradeAssignment("StacksAndQueuesQuiz", "Patrick", 83);

            grades.gradeAssignment("GithubExploration", "Tyler", 96);
            grades.gradeAssignment("GithubExploration", "James", 43);
            grades.gradeAssignment("GithubExploration", "Ethan", 100);
            grades.gradeAssignment("GithubExploration", "Scotty", 97);
            grades.gradeAssignment("GithubExploration", "David", 28);
            grades.gradeAssignment("GithubExploration", "Patrick", 100);

            for(int x = 0; x < ; x++){
                System.out.println();
            }

                System.out.println(grades);



    }

}
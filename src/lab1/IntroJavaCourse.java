package lab1;

/**
 * The responsibility of this class is to hold the data for the intro course
 *
 * @author      kpatr
 * @version     1.0.0
 */
public class IntroJavaCourse extends Courses {
    String prerequisites;

    /**
     * Constructor for the class accepts the courseName and the courseNumber
     * @param courseName name of the course
     * @param courseNumber number of the course
     */
    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    /**
     * Gets the pre requisits of the course
     * @return returns the pre reqs for the course
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets the prereqs for the course
     * @param prerequisites courses required for this course
     */
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            Output out = new Output("Error: prerequisites cannot be null of empty string");
            out.printConsole();
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }


}

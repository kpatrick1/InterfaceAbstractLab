package lab1;

/**
 * The responsibilities of this class is to maintain information related to an Advanced Java Course
 *
 * @author      Kevin Patrick
 * @version     1.0.0
 */
public class AdvancedJavaCourse extends Courses {
    private String prerequisites;

    /**
     * Constructor for the class accepts course name and number
     * @param courseName name of the course
     * @param courseNumber number of the course
     */
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    /**
     * Gets the pre Reqs for the course
     * @return string of pre Reqs
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets the pre Reqs for the course
     * @param prerequisites the pre reqs that are required for the course
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

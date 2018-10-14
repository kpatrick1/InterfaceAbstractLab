package lab2;

/**
 * The responsibilities of this class are to hold the Advanced Java Course Details
 *
 * @author      kpatr
 * @version     1.00
 */
public class AdvancedJavaCourse implements Courseable, Requirable {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    /**
     * The constructor of the class
     * @param courseName name of the course
     * @param courseNumber number of the course
     */
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    /**
     * returns the course number
     * @return number of the course
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * set the number for the course
     * @param courseNumber number of the course
     */
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            Output out = new Output("Error: courseNumber cannot be null of empty string");
            out.printJOption();
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    /**
     * gets the credits for the course
     * @return gets the credits for the course
     */
    public double getCredits() {
        return credits;
    }

    /**
     * sets the credits for the course
     * @param credits credits for the course
     */
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            Output out = new Output("Error: credits must be in the range 0.5 to 4.0");
            out.printJOption();
            System.exit(0);
        }
        this.credits = credits;
    }

    /**
     * get the prereqs for the course
     * @return the prereqs for the course
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Set the prereqs for the course
     * @param prerequisites prereqs for the course
     */
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            Output out = new Output("Error: prerequisites cannot be null of empty string");
            out.printJOption();
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    /**
     * gets the course name
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * set the course name
     * @param courseName name of the course
     */
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            Output out = new Output("Error: courseName cannot be null of empty string");
            out.printJOption();
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}

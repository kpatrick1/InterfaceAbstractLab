package lab2;


/**
 * The Responsibilities of this class is to manage the details of the Intro course
 *
 * @author      kpatr
 * @version     1.0.0
 */
public class IntroJavaCourse implements Courseable, Requirable {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    /**
     * The constructor of the course takes the course name and the course number
     * @param courseName name of the course
     * @param courseNumber number of the course
     */
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    /**
     * get the course number
     * @return the course number
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * sets the course number
     * @param courseNumber number of the course
     */
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            Output out = new Output("Error: courseNumber cannot be null of empty string");
            out.printJOption();
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    /**
     * gets the credits for this course
     * @return the credits for this course
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
     * @param prerequisites the prereqs for the course
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
     * get the course name
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * set the course name
     * @param courseName the course name
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

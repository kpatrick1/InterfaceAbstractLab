package lab2;


/**
 * The responsibilities of this class are to hold the Intro details
 *
 * @author      kpatr
 * @version     1.0.0
 */
public class IntroToProgrammingCourse implements Courseable {
    private String courseName;
    private String courseNumber;
    private double credits;

    /**
     * The constructor for the class accepts the coursename and the course number
     * @param courseName name of the course
     * @param courseNumber number of the course
     */
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    /**
     * get the number of the course
     * @return the course number
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * set the course number
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
     * get the credits for this course
     * @return credits for the course
     */
    public double getCredits() {
        return credits;
    }

    /**
     * set the credits for the course
     * @param credits credtis for the course
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
     * get the name of the course
     * @return name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * se the name of the course
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

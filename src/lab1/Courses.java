package lab1;

/**
 * Abstract class for the courses.  The responsibilites for this class is to assign the courseName courseNumber and credits
 * @author kpatr
 * @version 1.0.0
 */
public abstract class Courses {

    private String courseName;
    private String courseNumber;
    private double credits;

    /**
     * This is the Constructor for the Courses Class that takes the course name and number
     * @param courseName name of the course
     * @param courseNumber number of the course
     */
    public Courses(String courseName, String courseNumber) {
        set_courseName(courseName);
        set_courseNumber(courseNumber);
    }

    /**
     * Sets the courseName
     * @param courseName name of the course
     */
    public void set_courseName(String courseName){
        if(courseName == null || courseName.length() == 0) {
            Output out = new Output("Error: courseName cannot be null or empty string");
            out.printConsole();
            System.exit(0);
        }
        this.courseName = courseName;
    }

    /**
     * Returns the name of the course
     * @return the name of the course
     */
    public String get_courseName(){
        return this.courseName;
    }

    /**
     * Set the number of the course
     * @param courseNumber number of the course
     */
    public void set_courseNumber(String courseNumber){
        if(courseNumber == null || courseNumber.length() == 0) {
            Output out = new Output("Error: courseNumber cannot be null of empty string");
            out.printConsole();
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    /**
     * returns the courseNumber
     * @return the courseNumber
     */
    public String get_courseNumber(){
        return  this.courseNumber;
    }

    /**
     * Sets the credits for the course
     * @param credits credits of the course
     */
    private void set_credits(double credits){
        this.credits = credits;
    }

    /**
     * returns the credits for the course
     * @return credits of the course
     */
    public double get_credits(){
        return this.credits;
    }

    /**
     * set the credits of the course
     * @param credits credits of the course
     */
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            Output out = new Output("Error: credits must be in the range 0.5 to 4.0");
            out.printConsole();
            System.exit(0);
        }
        this.set_credits(credits);
    }

}

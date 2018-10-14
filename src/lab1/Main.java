package lab1;

/**
 * This is the Main class for the programming show that the classes work
 *
 * I think using abstraction this way is more beneficial because it has less duplicated code throughout the entire application
 *
 * Using liskov substitution principle to declare a variable using its abstract type is beneficial because it allows you to group
 * objects of certain types and iterate over them.
 *
 * @author kpatr
 * @version 1.0.0
 */
public class Main {

    /**
     * The main starting point of the application
     * @param args Command line args for the program
     */
    public static void main(String args[]){
        Courses adv = new AdvancedJavaCourse("Advanced Java", "152-123");
        Courses intro = new IntroJavaCourse("Introduction to Java", "152-321");
        Courses programmingIntro = new IntroToProgrammingCourse("Introduction to Programming","152-101");
        AdvancedJavaCourse adv1 = new AdvancedJavaCourse("Advanced Java", "152-123");

        adv.setCredits(4);
        intro.setCredits(3);
        programmingIntro.setCredits(2);

        ((AdvancedJavaCourse) adv).setPrerequisites("Intro Class 1");

        ((IntroJavaCourse) intro).setPrerequisites("Computer Basics");

        Output out = new Output(((AdvancedJavaCourse) adv).getPrerequisites().toString());
        out.printConsole();

    }
}

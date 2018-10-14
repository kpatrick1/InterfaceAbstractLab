package lab2;


/**
 * The responsibilities of this class is to run the program.
 *
 * I dont think this is a good design becuase there is lots of duplicated code throughout the application.
 * All similar classes have the same methods but the methods are created differently from class to class.
 *
 * I dont know how Liskov Substitution principle since eat class must be instantiated by itself and not an
 * abstract parent class.
 *
 * @author kpatr
 * @version 1.0.0
 */
public class Main {

    public static void main(String args[]){


        AdvancedJavaCourse adv = new AdvancedJavaCourse("Advanced Java", "152-123");
        IntroJavaCourse intro = new IntroJavaCourse("Introduction to Java", "152-321");
        IntroToProgrammingCourse programmingIntro = new IntroToProgrammingCourse("Introduction to Programming","152-101");

        adv.setCredits(4);
        intro.setCredits(3);
        programmingIntro.setCredits(3);

        adv.setPrerequisites("Intro Class 1 LAb2");

        intro.setPrerequisites("Computer Basics");

        Output out = new Output(((AdvancedJavaCourse) adv).getPrerequisites().toString());
        out.printConsole();



    }
}

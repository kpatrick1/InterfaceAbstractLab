package lab1;

/**
 * The responsibilities of this class are to handle the output
 * @author kpatr
 * @version 1.0.0
 */

import javax.swing.*;

public class Output {
    private String stringOut;

    /**
     * The constructor of the Output
     * @param msg the message to be outputted
     */
    public Output(String msg) {
        this.stringOut = msg;
    }

    /**
     * outputs to the console
     */
    public void printConsole() {
        System.out.println(stringOut);
    }

    /**
     * outputs to JOption
     */
    public void printJOption() {
        JOptionPane.showMessageDialog(null,stringOut);
    }

}

package houseassignmentmanager;

import javax.swing.JOptionPane;

/*------------------------------------------------------start------------------------------------------------------*/
//Java application that assigns students to a relevant sports house
public class HouseAssignmentManager {
    
    /*------------------------------------------main method start------------------------------------------*/
    public static void main(String[] args) {
        // Constants for the application
        final int numberStudents = 3;
        final int numberColours = 3;
        final int maxDigits = 4;

        // Arrays to store student information
        int studentNumber[] = new int[numberStudents];
        String studentName[] = new String[numberStudents];
        String colour[] = {"RED", "BLUE", "WHITE"};
        String studentColour[] = new String[numberStudents];

        // Loop to get input for each student
        for (int counter = 0; counter < numberStudents; counter++) {
            // Constructing input message based on the student number
            String message = "Please enter the ";
            switch (counter) {
                case 0:
                    message += "first";
                    break;
                case 1:
                    message += "second";
                    break;
                default:
                    message += "third";
                    break;
            }
            message += " student name";

            // Get user input for student name
            studentName[counter] = getUserInput(message);
            if (studentName[counter] == null) {
                // If user cancels input, exit the program
                JOptionPane.showMessageDialog(null, "Application cancelled.");
                System.exit(0);
            }

            // Generate random number of digits and assign a random color
            int numDigits = (int) (Math.random() * maxDigits) + 1;
            int maxStudentNumber = (int) Math.pow(10, numDigits);
            studentNumber[counter] = (int) (Math.random() * maxStudentNumber);
            studentColour[counter] = colour[(int) (Math.random() * numberColours)];
        }

        // Build output message
        StringBuilder output = new StringBuilder("SCHOOL HOUSE ASSIGNMENT\n**********************************\n");

        // Loop to construct the final output
        for (int counter = 0; counter < numberStudents; counter++) {
            output.append(studentName[counter])
                  .append(" assigned to the ")
                  .append(studentColour[counter])
                  .append(" house with student number ")
                  .append(studentColour[counter])
                  .append(Integer.toString(studentNumber[counter]))
                  .append("\n");
        }

        // Display the output in a JOptionPane
        JOptionPane.showMessageDialog(null, output.toString(), "School House Assignment", JOptionPane.INFORMATION_MESSAGE);
    }
    /*-------------------------------------------main method end-------------------------------------------*/ 

    // Method to get user input using JOptionPane
    private static String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }
}
/*-------------------------------------------------------end-------------------------------------------------------*/
/*
 * Priscilla Wettlén
 * AJ6817
 * Systemutvecklare
 * */

package partyController;

import partyModel.GuestManager;

import javax.swing.*;
import java.util.Scanner;

public class MainProgram
{
    public static void main(String[] args)
    {
         // Change this line later. Only using 10 as a default value to make compilations possible.
        /* Write code to read the number of guests to start with from the user by using one of
         - JOptionPane
         - Scanner and prompt
        */

        Scanner input = new Scanner(System.in);
        int maxNbrOfGuests = -1;
        boolean isValidInput = false;

        while(!isValidInput){
            System.out.println("How many guests would you like to have?");
            if (!input.hasNextInt()) {
                JOptionPane.showMessageDialog(null, "Error: Number of guests must be greater than 0");
                //System.out.println("ERROR: Please enter a valid number.");
                input.next();
                continue;
            }

            maxNbrOfGuests = input.nextInt();

            if(maxNbrOfGuests <= 0){
                JOptionPane.showMessageDialog(null, "Error: Number of guests must be greater than 0");
                //System.out.println("ERROR: Number of guests must be greater than 0.");
            } else{
                isValidInput = true;
            }

        }

        Controller controller = new Controller(maxNbrOfGuests);
    }
}

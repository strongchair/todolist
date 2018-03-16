package todolist;

import java.util.Scanner;

public class index {
	
	public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - View my Todolist");
        System.out.println("2 - Add Item to Todolist");
        System.out.println("3 - Remove Item to Todolist");
        System.out.println("4 - Quit");

        selection = input.nextInt();
        return selection;    
    }
	
	public static void main(String[] args) {

        int userChoice;
        Scanner input = new Scanner(System.in);

        /*********************************************************/
        userChoice = menu();

        //from here you can either use a switch statement on the userchoice 
        //or you use a while loop (while userChoice != the fourth selection)
        //using if/else statements to do your actually functions for your choices.
        switch (userChoice) {
        case 1:
            // Perform "original number" case.
            break;
        case 2:
            // Perform "encrypt number" case.
            break;
        case 3:
            // Perform "decrypt number" case.
            break;
        case 4:
            // Perform "quit" case.
            break;
        default:
            // The user input an unexpected choice.
        }

    }
}

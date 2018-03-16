package todolist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;

public class index {
	
	public static String enterUsername() {

        String username;
        Scanner input = new Scanner(System.in);
        
        /***************************************************/
        System.out.println("Please enter your username: \n");
       

        username = input.nextLine().trim().toUpperCase();
        return username;    
    }
	public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);
        
        /***************************************************/
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - View my Todolist");
        System.out.println("2 - Add Item to Todolist");
        System.out.println("3 - Remove Item to Todolist");

        selection = input.nextInt();
        return selection;    
    }
	
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
		
		//step1: enter user name
		String username;
		username = enterUsername();
		
		//step2: take in menu choice
        int userChoice;
        userChoice = menu();

        //from here you can either use a switch statement on the userchoice 
        //or you use a while loop (while userChoice != the fourth selection)
        //using if/else statements to do your actually functions for your choices.
        switch (userChoice) {
        case 1:
            // Perform "1
        	
        case 2:
            // Perform "2" case.
            break;
        case 3:
            // Perform "3" case.
            break; 
        default:
            // The user input an unexpected choice.
        }

    }
}

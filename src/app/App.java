package src.app;

import java.util.ArrayList;
import java.util.Scanner;
import src.list.List;
import src.list.ListItem;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args) throws Exception {

        logger.info("This is info");
        logger.debug("This is debug");
        logger.error("This is error");
        logger.trace("This is trace");
        logger.fatal("This is fatal");
        logger.warn("This is warn");

        //creating a scanner object which will allow the user to input their option
        Scanner reader = new Scanner(System.in);
        //local variable
        int option;

        // create list object
        List newList = new List();

        System.out.println("******************************************************\n");
        System.out.println("WELCOME!\n");
        System.out.println("Select an option from the menu below...\n");

        System.out.println("1. Create a list");
        System.out.println("2. Delete a list");
        System.out.println("3. Add to an existing list");
        System.out.println("4. View a list");
        System.out.println("5. Exit\n");

        // takes a line from the keyboard & parses it to an integer
        option = Integer.parseInt(reader.nextLine()); 


            switch(option){
                case 1:
                    System.out.println("Let's create a list shall we...\n");
                    newList.setTitle(reader.nextLine());
                    
                    break;
                
                case 2:
                break;
                
                case 3:
                break;
                
                case 4:
                break;
                
                default:
                System.out.println("Goodbye!");
            }  
        
        System.out.println("******************************************************\n");

        /*

        //creating an arraylist to store food items WITHOUT casting
        ArrayList<ListItem> foodList = new ArrayList<ListItem>();

        //initiating a new object and adding it to the list
        foodList.add(new ListItem("Grocery Shopping", "cereal, cookies, cake"));
        foodList.add(new ListItem("Market", "Tomatoes, pepper, potatoes, apples"));

        //using a Foreach loop to print the details of the arraylist
        for(ListItem i: foodList){
            System.out.println(i);
        }

        //printing the second item in the list 
        System.out.println(foodList.get(1).getDetail());

        
        /* //initiating new object of listItem 
        ListItem ls = new ListItem("Grocery Shopping", "cereal, cookies, cake");
        System.out.println(ls);*/

        

    }
}

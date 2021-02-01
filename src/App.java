package src;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

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

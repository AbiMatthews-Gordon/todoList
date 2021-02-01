package src;

import java.time.LocalDateTime;

public class ListItem{
    
    //local variables
    String title;
    String detail;
    LocalDateTime dateTimeCreated;
    LocalDateTime dateTimeAmended;

    //default constructor 
    public ListItem(){
        this.title = "";
        this.detail = "";
        this.dateTimeCreated = LocalDateTime.now();
        this.dateTimeAmended = LocalDateTime.now();
    }

    //primary constructor
    public ListItem(String title, String detail){
        this.title = title;
        this.detail = detail;
        this.dateTimeCreated = LocalDateTime.now(); //this is automatic, meaning no one is allowed to ammend the date and time
        this.dateTimeAmended = LocalDateTime.now(); //this is automatic, meaning no one is allowed to ammend the date and time
    }

    //copy constructor
    public ListItem(ListItem list){
        this.title = list.title;
        this.detail = list.detail;
        this.dateTimeCreated = LocalDateTime.now();
        this.dateTimeAmended = LocalDateTime.now();
    }

    //getters and setters
    String getTitle(){
        return title;
    }

    void setTitle(String title){
        this.title = title;
    }

    String getDetail(){
        return detail;
    }

    void setDetail(String detail){
        this.detail = detail;
    }

    LocalDateTime getDateTimeCreated(){
        return dateTimeCreated;
    }

    LocalDateTime getDateTimeAmended(){
        return dateTimeAmended;
    }

    //getting a string representation of the class
    public String toString(){
        return "Title is: " + title + "\nDetail is: " + detail + "\nDate and Time Created is: " + dateTimeCreated + "\nDate and Time Amended is: " + dateTimeAmended +"\n";
    }

}
package src.list;

import java.util.ArrayList;

public class List {

    ArrayList<ListItem> items;
    String title;

    /**
     * 
     */
    public List(){
        this.items = new ArrayList<ListItem>();
    }

    /**
     * 
     * @param title
     * @param detail
     * @return
     */
    public void addListItem(String title, String detail){

        ListItem newItem = new ListItem(title, detail);

        items.add(newItem);
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
 

}

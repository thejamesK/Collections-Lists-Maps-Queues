package arrayorazlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

class AddedList
{
    int value;
    AddedList next;
    AddedList previous;
}

public class Arrayorazlinkedlist 
{

    public static void main(String[] args) 
    {
        ArrayList tabList = new ArrayList(6);
        tabList.add(new Object());
        tabList.add(new Object());
        tabList.add(new Object());
        tabList.add(new Object());
        tabList.add(new Object());
        tabList.add(new Object());
        
        AddedList addedList = new AddedList();
        
        addedList.value = 10;
        
        addedList.next = new AddedList();
        addedList.next.value = 20;
        
        addedList.next.next = new AddedList();
        addedList.next.next.value = 30;
        
        
        System.out.println(addedList.value);
        System.out.println(addedList.next.value);
        System.out.println(addedList.next.next.value);
    }
    
}

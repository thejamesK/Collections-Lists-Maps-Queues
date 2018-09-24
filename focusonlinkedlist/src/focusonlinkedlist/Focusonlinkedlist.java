package focusonlinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Focusonlinkedlist 
{

    public static void main(String[] args) 
    {
        LinkedList<String> linkedList = new LinkedList();
        
        linkedList.add("lala1");
        linkedList.add("lala2");
        linkedList.add("lala3");
        linkedList.add("lala4");
        
//        for(int i = 0; i < linkedList.size(); i ++)
//        {
//            System.out.println(linkedList.get(i));
//        }
        Focusonlinkedlist.writeListElements(linkedList);
        
        
        
        ListIterator<String> iter = linkedList.listIterator(linkedList.size());
        
        while(iter.hasPrevious())
        {
            System.out.println(iter.previous());
            iter.set("change");
        }
        
        iter = linkedList.listIterator();
        iter.next();
        iter.add("new lala");
        
        // iter.remove(); // removing previous element
        
        Focusonlinkedlist.writeListElements(linkedList);
        
        
    }
    
    public static void writeListElements(LinkedList<?> list)
    {
        Iterator listIterator = list.iterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        
        
        System.out.println();
        
        }
    
}

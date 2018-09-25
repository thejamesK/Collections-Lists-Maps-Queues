package hassetandtreeset;


import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


class Element implements Comparable
{
    
    int value;
    String description;
    public Element(int value)
    {
        this.value = value;
    }
    
    public Element(int value, String description)
    {
        this.value = value;
        this.description = description;
    }
        
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        return this.value == ((Element)obj).value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 14 * hash + this.value;
        return hash;
    }
    public String getDescription()
    {
        return description;
    }
    

    @Override
    public int compareTo(Object t) 
    {
        return value - ((Element)t).value;  
    }
}

public class Hassetandtreeset 
{

    public static void main(String[] args) 
    {
        Set<Element> set =  new TreeSet<Element>(
                new Comparator<Element>() 
        {
            @Override
            public int compare(Element t, Element t1) 
            {
                String descriptionT = t.getDescription();
                String descriptionT1 = t1.getDescription();
                
                return descriptionT.compareTo(descriptionT1);
            }
        }
        
        
                );
        
        set.add(new Element(12345, "Description"));
        set.add(new Element(5, "ADescription"));
        set.add(new Element(445, "ZDescription"));
        
        
        Iterator<Element> iter = set.iterator();
        while(iter.hasNext())
            System.out.println(iter.next().getDescription());
         
        
        System.out.println("Set size: " + set.size());
        
    }
    
}

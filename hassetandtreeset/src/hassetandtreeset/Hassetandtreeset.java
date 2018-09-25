package hassetandtreeset;


import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


class Element
{
    public Element(int value)
    {
        this.value = value;
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
    
    int value;
}

public class Hassetandtreeset 
{

    public static void main(String[] args) 
    {
        long mili = 0;
        long totalMili = 0;
        Set<String> set =  new HashSet<String>(512);
        set = new TreeSet<String>();
        try 
        {
            Scanner reader = new Scanner(new BufferedReader(new FileReader("informatyka.txt")));
            
            while(reader.hasNext())
            {
                mili = System.currentTimeMillis();

                set.add(reader.next());

                totalMili += (System.currentTimeMillis() - mili);
            }
            reader.close();
        } 
        catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
        }
        
        Iterator<String> iter = set.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
            
        
        
        System.out.println("Exequte time: " + totalMili + " ms");
        System.out.println("Set size: " + set.size());
        
    }
    
}

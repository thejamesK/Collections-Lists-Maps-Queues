package typygeneryczne;

import java.util.ArrayList;


public class Typygeneryczne 
{

    public static void main(String[] args) 
    {
        ArrayList<String> a = new ArrayList<String>();
        
        a.add(new String("lala"));
        a.add(new String("lala2"));
        a.add(new String("lala3"));
        a.add(new String("lala4"));
        a.add(new String("lala5"));
        a.add(new String("lala6"));
        a.add(new String("lala7"));
        
        
        //a.add(new Integer(4));
        
        
        /*for(int i = 0; i < a.size(); i++)
            System.out.println((String)a.get(i));
        */
        
        for(String strings : a)
            System.out.println(strings);
        
        
        normal<String> variableName = new normal();
        variableName.giveValue("something");
        System.out.println(variableName.returnFOO());
    }
    
}

class normal<FOO>
{
    public void giveValue(FOO value)
    {
        this.variableNameTypeFoo = value;
    }
    public FOO returnFOO()
    {
        return this.variableNameTypeFoo;
    }
    
    FOO variableNameTypeFoo;
}

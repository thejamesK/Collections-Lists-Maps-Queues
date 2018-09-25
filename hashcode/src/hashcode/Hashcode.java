package hashcode;

import java.util.Objects;


class Element
{
    public Element(int value)
    {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.value;
        /*
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.foo) ^ (Double.doubleToLongBits(this.foo) >>> 32));
        hash = 47 * hash + (int) (this.foo2 ^ (this.foo2 >>> 32));
        hash = 47 * hash + Objects.hashCode(this.foo3);
        * */
        return hash;
    }

    
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        return this.value == ((Element)obj).value;
    }
    
    int value;
    
    double foo;
    long foo2;
    String foo3;
}
public class Hashcode 
{

    public static void main(String[] args) 
    {
        Element a = new Element(47);
        Element b = new Element(15);
        Element c = null;
        
        System.out.println(a.equals(b)); 
        
        
        System.out.println(a.hashCode()%128);
        System.out.println(b.hashCode()%128);
        
        
    }
    
}

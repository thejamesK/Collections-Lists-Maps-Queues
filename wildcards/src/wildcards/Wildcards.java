package wildcards;

import java.util.ArrayList;
import java.util.List;

class SuperClass
{
    public static void test(List<? extends SuperClass> list)
    {
        
    }
}

class SubClass extends SuperClass
{
    
}

public class Wildcards
{

    public static void main(String[] args) 
    {
        List<String> stringList = new ArrayList<>();
        
        
        List<SuperClass> classList = new ArrayList<>();
        List<SubClass> classList2 = new ArrayList<>();
        classList.add(new SuperClass());
        classList.add(new SubClass());
        
        
        SuperClass.test(classList2);
        
      
    }
    
}

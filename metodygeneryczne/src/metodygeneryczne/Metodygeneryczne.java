package metodygeneryczne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Editor
{
    public static void write(List<? extends Figure> list)
    {
        
        
        for(Figure figure : list)
        {
            System.out.println(figure.getName());
        }
        
        
        list.add(null);
        System.out.println("---------------------");
        
        for(Figure figure : list)
        {
            if(figure == null)  
            {
                System.out.println("null");
                break;
            }    
            System.out.println(figure.getName());
        }
    }
    
        public static <T extends Figure> void write2(List<T> list)
    {
        
        
        for(T figure : list)
        {
            System.out.println(figure.getName());
        }
        list.add((T) new Circle());
        list.add((T) new Circle());
        list.add((T) new Circle());
        list.add((T) new Circle());
        list.add(null);
        System.out.println("---------------------");
        
        for(T figure : list)
        {
            if(figure == null)  
            {
                System.out.println("null");
                break;
            }    
            System.out.println(figure.getName());
        }
    }
    
    public static <Type> void rewriteTableToCollection(Type[] tab, Collection<Type> c)
    {
        for(Type o: tab)
        {
            c.add(o);
        }
    }

}

class Figure <K>
{
    K lala;
    public String getName()
    {
        return name;
    }
    String name = "";
}

class Circle extends Figure
{
    public Circle()
    {
        super.name = "Circle";
    }
}

class Square extends Figure
{
    public Square()
    {
        super.name = "Square";
    }
}

public class Metodygeneryczne 
{

    public static void main(String[] args) 
    {
        Figure figure1 = new Circle();
        Figure figure2 = new Square();
        Figure[] figures = new Figure[50];
        
        List<Figure> figureList = new ArrayList<>();
        figureList.add(figure1);
        figureList.add(figure2);
        
        
        Editor.write2(figureList);
        
        
        Float[] fl = new Float[50];
        Integer[] in = new Integer[50];
        Number[] nu = new Number[50];
        
        Collection<Number> cn = new ArrayList<>();
        Editor.rewriteTableToCollection(fl, cn);
        Editor.rewriteTableToCollection(in, cn);
        Editor.rewriteTableToCollection(nu, cn);
        
    }
    
}

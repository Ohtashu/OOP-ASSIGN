import java.util.Scanner;
public class RunQuad {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Press R for Rectangle or S for Square: ");
    String shape = scan.nextLine();
    if(shape.equalsIgnoreCase("R"))
    {
        Rectangle r = new Rectangle();
        r.showDescription();
         
    }
    else if(shape.equalsIgnoreCase("S"))
    {
       Square s = new Square();
       s.showDescription();
    }
}
}
//Quadrilateral
class Quadrilateral{

public void showDescription(){

System.out.println("-is quadrilateral");
}
}
//rectangle
 class Rectangle extends Quadrilateral{

public void showDescription(){
    System.out.println("-has 4 right angles");
    super.showDescription();

}
}
//Square
class Square extends Rectangle
{
    
    public void showDescription(){ 
    
    System.out.println("-has 4 right sides");
    super.showDescription();
}
}

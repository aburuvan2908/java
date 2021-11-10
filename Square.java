public class Square
{
public static void main(String[] args)
{
Square square = new Square(); 
//int area = square.calculateArea(10); // parameter --> 10//
System.out.println("Area is " +new Square().calculateArea(10) ); 
}

public int calculateArea(int l)
{
return l*l;
}
} 
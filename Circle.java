public class Circle
{
public static void main (String[] args)
{
Circle cir = new Circle();
double area = cir.calculatearea(10);
System.out.println("area is "+ area);
}
public double calculatearea(int r)
{
return (Math.PI*r*r);
}
}

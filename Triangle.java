public class Triangle
{
public static void main(String[] args)
{
Triangle tri = new Triangle();
int area = tri.calculatearea(10,2);
System.out.println("area is "+ area);
}
public int calculatearea(int b, int h)
{
return (b * h)/2;
}
}
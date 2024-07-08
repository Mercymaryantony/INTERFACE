import java.util.*;
interface shapes
{
    void getArea();
}
class Rectangle implements shapes
{
    private float length,breadth;
    public Rectangle(float l,float b)
    {
        this.length=l;
        this.breadth=b;
    }
    public void getArea()
    {
        float area=length*breadth;
        System.out.println("The area of rectnagle is "+area);
    }

}
class Circle implements shapes
{
    private float radius;
    public Circle(float r)
    {
        this.radius=r;
    }
    public void getArea()
    {
        float area=radius*radius*3.14f;
        System.out.println("The area of rectnagle is "+area);
    }

}
class Triangle implements shapes
{
    private float base,heigth;
    public Triangle(float b,float h)
    {
        this.base=b;
        this.heigth=h;
    }
    public void getArea()
    {
        float area=(base*heigth)/2;
        System.out.println("The area of rectnagle is "+area);
    }

}
public class area
{
    public static void main(String args[])
    {
        float l,b,base,h,r;
        Scanner s= new Scanner(System.in);
        System.out.println("AREA OF SHAPES\n------------\n1.Rectangle\t2.Triangle\t3.Circle\t4.Exit");
        int ch;
        do{
            System.out.println("Enter your choice:");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the length and breadth");
                l=s.nextFloat();
                b=s.nextFloat();
                Rectangle rect=new Rectangle(l,b);
                rect.getArea();
                break;
                case 2:
                System.out.println("Enter the base and height");
                base=s.nextFloat();
                h=s.nextFloat();
                Triangle tri=new Triangle(base,h);
                tri.getArea();
                break;
                case 3:
                System.out.println("Enter the radius");
                r=s.nextFloat();
                Circle circle=new Circle(r);
                circle.getArea();
                break;
                case 4:
                System.exit(0);
                default :
                System.out.println("Invalid choice\nEnter a valid choice");

            }
        }while(true);
    }
}
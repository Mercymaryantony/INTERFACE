import java.util.*;
interface shape
{
    float area();
    float perimeter();
}
class circle implements shape
{
    float radius;
    circle(float r)
    {
        this.radius=r;
    }
    public float area()
    {
        return (radius*radius*3.14f);
    }
    public float perimeter()
    {
        return 2*3.14f*radius;
    }
}
class rectangle implements shape
{
    float len,width;
    rectangle(float l,float w)
    {
        this.len=l;
        this.width=w;
    }
    public float area()
    {
        return len*width;
    }
    public float perimeter()
    {
        return 2*(len+width);
    }
}
public class index
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int ch ;
        System.out.println("AREA AND PERIMETER\n-----------------------\n1.Circle\t2.Rectangle\t3.Exit");
        
        do
        {
            System.out.println("Enter your choice");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the radius");
                float r=s.nextFloat();
                circle c=new circle(r);
                System.out.println("Area="+c.area());
                System.out.println("Perimeter="+c.perimeter());
                break;
                case 2:
                System.out.println("Enter the len and width");
                float l=s.nextFloat();
                float w=s.nextFloat();
                rectangle re=new rectangle(l, w);
                System.out.println("area="+re.area());
                System.out.println("Perimeter="+re.perimeter());
                break;
                case 3:
                System.exit(0);
                break;
                default :
                System.out.println("Invalid choice");
            }
        }while(true);
    }
}
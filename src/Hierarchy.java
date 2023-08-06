import java.util.Scanner;
public class Hierarchy {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        String cirColor,recColor,triColor;
        System.out.println("choose color for circle");
        cirColor=in.nextLine();

        System.out.println("choose color for Rectangle");
        recColor=in.nextLine();

        System.out.println("choose color for Triangle");
        triColor=in.nextLine();

        double radius,length,width,height,base;

//circle shape implement
        Circle ci=new Circle(cirColor,"Circle");

        System.out.println("enter the radius for circle shape");
        radius= in.nextDouble();

        ci.setRadius(radius);

        double cirArea=ci.area();
        double cirPeri=ci.perimeter();

       ci.displayShCol();
        System.out.println("Area of Circle: "+cirArea);
        System.out.println("Perimeter of Circle: "+cirPeri);

        Shape hr=new Shape("Circle");
        hr.setColor(cirColor);
        hr.setShape("Circle");
        hr.displayShCol();

//rectangle shape implement
        Rectangle rec=new Rectangle(recColor,"Rectangle");

        System.out.println("enter the length and width for rectangle shape");
        length= in.nextDouble();
        width= in.nextDouble();

        rec.setLength(length);
        rec.setWidth(width);

        double recArea= rec.area();
        double recPeri=rec.perimeter();

        rec.displayShCol();
        System.out.println("Area of Rectangle: "+recArea);
        System.out.println("Perimeter of Rectangle: "+recPeri);

        hr.setColor(recColor);
        hr.setShape("Rectangle");
        hr.displayShCol();


//triangle shape implement
        Triangle tri=new Triangle(triColor,"triangle");

        System.out.println("enter the height and base for triangle shape");
        height= in.nextDouble();
        base= in.nextDouble();

        tri.setHeight(height);
        tri.setBase(base);

        double triArea= tri.area();
        double triPeri=tri.perimeter();


        System.out.println("Area of Rectangle: "+recArea);
        System.out.println("Perimeter of Rectangle: "+recPeri);

        System.out.println("Area of Triangle: "+triArea);
        System.out.println("Perimeter of Triangle: "+triPeri);

        rec.displayShCol();
        System.out.println("Area of Triangle: "+recArea);
        System.out.println("Perimeter of Triangle: "+recPeri);

        hr.setColor(triColor);
        hr.setShape("Triangle");
        hr.displayShCol();

    }
}

public class Circle extends Shape{
    private double radius;
    private final double pi=3.24;
    private String Shape,cirColor;

    Circle(String col, String sh)
    {
        super(col,sh);
        cirColor=col;
        Shape=sh;
    }



     void setRadius(double rad)
     {
        radius=rad;
     }

     double getRadius()
     {
         return radius;
     }
    double area()
    {
        return radius*radius*pi;
    }

    double perimeter()
    {
        return 2*pi*radius;
    }

    void displayShCol()
    {
        System.out.println("Shape: "+Shape);
        System.out.println("Color: "+cirColor);

    }





}

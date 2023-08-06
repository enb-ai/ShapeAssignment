public class Rectangle extends Shape{

   private double length,width;
   private String Shape,recColor;

    Rectangle(String col, String sh)
    {
        super(col,sh);
        recColor=col;
        Shape=sh;
    }

    void setLength(double len)
    {
        length=len;
    }

    double getLength()
    {
        return length;
    }

    void setWidth(double wid)
    {
        width=wid;
    }

    double getWidth()
    {
        return width;
    }

    double area()
    {
        return length * width;
    }

    double perimeter()
    {
        return 2*(length+width);
    }

    void displayShCol()
    {System.out.println("Shape: "+Shape);
        System.out.println("color: "+recColor);
    }

}

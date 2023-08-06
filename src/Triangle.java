
public class Triangle extends Shape{

    private double base,height;
    private String Shape,triColor;

    Triangle(String col, String sh)
    {
        super(col,sh);
        triColor=col;
        Shape=sh;
    }


    void setHeight(double hei)
    {
        height=hei;
    }

    double getHeight()
    {
        return height;
    }

    void setBase(double bas)
    {
        base=bas;
    }

    double getBase()
    {
        return base;
    }

    double area()
    {
        return (base*height)/2;
    }

    double perimeter()
    {
        return java.lang.Math.sqrt((base*base)+(height*height)) + height + base;
    }

    void displayShCol()
    {System.out.println("shape name: "+Shape);
        System.out.println("Color: "+triColor);
    }
}

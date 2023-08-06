class Shape{
    private String Color,Shape;

    Shape(String col,String sh)
    {
       this.Color=col;
       this.Shape=sh;
    }

    void setColor(String col)
    {Color=col;}

    void setShape(String sh)
    {Shape=sh;}
    void displayShCol()
    {
        System.out.println("The color you choose for the shape: "+Color);
        System.out.println("The shape name: "+Shape);


    }

    Shape(String name)
    {
        ;
    }


}
//Instatiable Class
public class RectangleArea{
    // Variables
    private double length;
    private double width;
    private double area;

    //set
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }

    //compute
    public void computeArea(){
        area = width * length;
    }

    //get
    public double getArea(){
        return area;
    }

}

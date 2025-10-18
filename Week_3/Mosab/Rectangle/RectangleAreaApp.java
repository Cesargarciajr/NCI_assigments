import javax.swing.JOptionPane;

public class RectangleAreaApp {
    public static void main(String[] args) {
        // variables
        double length;
        double width;
        double area;

        // objects
        RectangleArea r;
        r = new RectangleArea();

        // inputs
        length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter length"));
        width = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter width"));

        // set
        r.setLength(length);
        r.setWidth(width);

        // compute
        r.computeArea();

        // get
        area = r.getArea();

        // output
        JOptionPane.showMessageDialog(null, "Area is " + area);
    }   
}

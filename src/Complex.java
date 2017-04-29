
import static java.lang.Math.*;

public class Complex {
    double x;
    double y;
    public Complex(double _x,double _y)
    {
        x=_x;
        y=_y;
    }
    public Complex()
    {

    }
    public Complex sum(Complex c)
    {
        return new Complex(x+c.x,y+c.y);
    }
    public Complex minus(Complex c) {
        return new Complex(x-c.x, y-c.y);
    }
    public Complex mult(Complex c) {
        return new Complex(x*c.x-y*c.y, y*c.x+x*c.y);
    }
    public Complex div(Complex c) {
        return new Complex((x*c.x+y*c.y)/(c.x*c.x+c.y*c.y), (y*c.x-x*c.y)/(c.x*c.x+c.y*c.y));
    }
    public Double abs() {
        return sqrt(x*x+y*y);
    }
    public Complex cont() {
        return new Complex(x, -y);
    }
    public Double arg() throws Exception {
        if (x>0) return atan(y/x);
        throw new Exception("Аргумент х<=0");

    }
}
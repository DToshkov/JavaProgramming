import java.lang.Math;

class Circle {
    private double radius;
    private double area;
    private double diameter;
    public Circle() {
        radius = 1;
        area = Math.PI * (radius * radius);
        diameter = radius * 2;
        
    }
     
    public void setRadius(double r) {
        radius = r;
        area = Math.PI * (radius * radius);
        diameter = radius * 2;
    }
   
    public double getRadius() {
        return radius;
    }
   
    private void computeDiameter() {
        diameter = this.radius * 2;

    }

    private void computeArea() {
        area = Math.PI * (this.radius * this.radius);

    }
    public double getDiameter() {
        return diameter;
    }
    public double getArea() {
        return area;
    }
}

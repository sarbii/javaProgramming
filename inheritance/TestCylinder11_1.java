
  class Circle {
    private double radius;
    private String color;
    private double area;
    
    public Circle(){
        
    }
    public Circle(double r){
        this.radius = r;
    }
    public double getArea() {
        area = radius * radius * Math.PI;
        return area;
    }
    public double getRadius() {
        return radius;
    }
    
}

class Cylinder extends Circle{
    public double height; 
    public Cylinder() {
        // TODO Auto-generated constructor stub
    }
    public Cylinder(double r){
        super(r);
    }
    public Cylinder(double r, double h){
        super(r);
        this.height = h;
    }
    public double getHeight(){
        return height;
    }
    
    public double getVolume(){
        
        return getArea()*height;
    }
}

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(5.0,3.0);
        System.out.println("c1 의 부피 : "+c1.getVolume());
        System.out.println("C1 의 면적 : "+c1.getArea());
        System.out.println("C1 의 높이 : "+c1.getHeight());
        System.out.println("C1 의 반지름 : "+c1.getRadius());
        
        System.out.println("C2 의 부피 : "+c2.getVolume());
        System.out.println("C2 의 면적 : "+c2.getArea());
        System.out.println("C2 의 높이 : "+c2.getHeight());
        System.out.println("C2 의 반지름 : "+c2.getRadius());
    }
    
}

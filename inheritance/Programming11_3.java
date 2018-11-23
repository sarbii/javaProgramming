class Shape1{
    int x,y;
    public Shape1() {
        
    }
    public Shape1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double area(){
        int area = x * y;
        return area;
    }
    public int perimeter(){ 
        int perimeter = x+y;
        return perimeter;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
}
class Triangle extends Shape1{
    
    int y1,y2,h;
    public Triangle(int x, int y1,int y2,int h) {
        this.x = x;
        this.y1 = y1;
        this.y2 = y2;
        this.h = h;
    }
    
    public double area(){
        
        double area = x*h*0.5;
        return area;
    }
    public int perimeter(){
        int perimeter = x+y1+y2;
        return perimeter;
    }
}
public class Programming11_3 {
    public static void main(String[] args) {
        Shape1 s1 = new Shape1(3, 5);
        System.out.println("도형의 면적 : "+s1.area());
        System.out.println("도형의 둘레 : "+s1.perimeter());
        
        Triangle t1 = new Triangle(1,2, 2,5);
        System.out.println("삼각형의 면적 : "+t1.area());
        System.out.println("삼각형의 둘레 : "+t1.perimeter());
        
    }
}



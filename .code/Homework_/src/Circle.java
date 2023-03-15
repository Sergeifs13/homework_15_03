public class Circle extends Shapes{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public float getAreaCircle(){
        this.area = (float) (Math.PI*(radius*radius));
    return area;
    }
}

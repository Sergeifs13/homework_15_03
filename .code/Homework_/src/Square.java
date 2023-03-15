public class Square extends Shapes{
    double a;

    public Square(double a) {
        this.a = a;
    }

    public float getAreaSquare() {
        this.area = (float) (a * a);
        return area;
    }
}

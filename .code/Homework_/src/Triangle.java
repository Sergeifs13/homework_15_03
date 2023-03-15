public class Triangle extends Shapes {
    double basisTriangle;
    double height;
    public Triangle(double basisR, double height) {
        this.basisTriangle = basisR;
        this.height = height;
    }
    public float getAreaTriangle(){
        this.area = (float) ((basisTriangle*height)/2);
        return area;
    }
}

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){};
    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolum(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "color = "+this.getColor()+" radius = "+this.getRadius()+
                " height= " + height +" area = "+this.getVolum()+
                '}';
    }
}

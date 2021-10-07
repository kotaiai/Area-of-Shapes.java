public class Circle {
    private double PI;
    private double radius;
    private double area;

    public double getPI(){
        return PI;
    }

    public double getradius(){
        return radius;
    }

    public double getarea(){
        return PI * (Math.pow(radius,2));
    }

    public void setPI(double newPI){
        this.PI = newPI;
    }

    public void setradius(double newradius){
        this.radius = newradius;
    }

    public void setarea(double newarea){
        this.area = newarea;
    }
}

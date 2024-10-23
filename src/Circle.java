public class Circle {
    public static final double PI = 20;//Бир  жана акыркы жолу маани бериш учун.
    private  double radius;
    public Circle( double radius){//Конструктор.
        this.radius = radius;
    }//Areaны табуу учун.
public static double area(double radius){
    return PI * (radius * radius);

}//Circumferenceти табуу учун.
public  static double circumference(double radius) {
    return PI * 2 * radius;
}
    public double getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;

    }
}

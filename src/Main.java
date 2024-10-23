import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
жана circumference деген статик методдору болсун.
areaны табуу учун: PI * (radius * radius)
circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
*/
       Circle circle = new Circle(15);
        System.out.println("Area: "+Circle.area(circle.getRadius()));
        System.out.println("Circumference: "+Circle.circumference(circle.getRadius()));


        }
    }

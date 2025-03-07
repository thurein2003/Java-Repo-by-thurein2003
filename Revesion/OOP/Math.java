package Revesion.OOP;
import java.util.*;

public class Math {
    public static void main(String[] args){
        final double PI = 3.14;
        double radius, area, circum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius : ");
        radius = input.nextDouble();

        area = PI * radius * radius;
        circum = 2.0 * PI * radius;

        System.out.println("------------------------");
        System.out.println("Area : " + area);
        System.out.println("Circumference : " +circum);
    }
}

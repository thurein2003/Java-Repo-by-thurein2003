package Revesion.OOP;
import java.util.*;
public class BodyWeight {
    public static void main(String[] args) {
        float weight;
        float height;
        float BMI;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your weight : ");
        weight = input.nextFloat();

        System.out.print("enter height : ");
        height = input.nextFloat();

        BMI = weight / (height * height);
        System.out.print("BMI   :   " + BMI);
    }
}

package Revesion;

import java.util.Scanner;
import javax.swing.JFrame;

public class input {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("What is Your name : ");
        String nam = name.next();
        System.out.print("My name is : " + nam);     


        JFrame myWindow = new JFrame();
        myWindow.setVisible(true);

    }
}

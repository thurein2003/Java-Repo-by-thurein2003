package Revesion;

public class Level1 {
    String name;

    public void setName(String stName){
        name = stName;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Level1 nm = new Level1();
        nm.setName("OOP");

        System.out.print("My java is " +nm.getName());

    }

}

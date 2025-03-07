package Revesion.OOP;

import java.util.Date;

public class day {

    public static void main(String[] args) {
        day date = new day();
        date.setDay(15);
        System.out.println(date.getDay());
    }
    
    private int day;

    public void setDay(int day){
        if(day > 0 && day <= 31){
            this.day = day;
        }
    }

    public int getDay(){
        return day;
    }


}

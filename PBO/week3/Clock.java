package PBO.week3;
import java.util.Scanner;


public class Clock{
    public static void main(String[] args){
        ClockDisplay jam = new ClockDisplay();
        // System.out.println(jam.getTime());

        while (true) {
            System.out.println(jam.getTime());
            jam.timeTick();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Clock was interrupted.");
                break; 
            }
        }
    }
}
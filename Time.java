/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextBook_Excercises;

/**
 *
 * @author C0530980
 */
public class Time
{
    public static void main(String[] args) {
        int timeCurrent = 948;
        int timeStart = 930;
        
        int hour = timeCurrent / 100;
        int min = timeCurrent % 100;
        int sec = hour * 3600 + (min * 60);
        
        int hour2 = timeStart / 100;
        int min2 = timeStart % 100;
        int sec2 = hour2 * 3600 + (min2 * 60);
        
        int selapsed = sec - sec2;
        int helapsed = selapsed / 3600;
        int melapsed = selapsed / 60;
        int selapsedf = selapsed - ((melapsed * 60) + (helapsed * 3600));
 
        int secsinMid = 43200 - sec;
        int secremain = 86400 - sec;
        float secf = sec;
        float Percentday = (secf / 86400) * 100;
        
        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + sec);
        System.out.println("Seconds Since Midnight: " + secsinMid);
        System.out.println("Seconds Remaining in Day: " + secremain);
        System.out.println("Progress in Day: " + Percentday + "%");
        System.out.println("Time Elapsed Since Starting Question: " + helapsed + " hours " + melapsed + " minutes " + selapsedf + " seconds.");
    }
}

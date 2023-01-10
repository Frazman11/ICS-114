
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Time
{
    public static void main(String[] args) {
        int time = 1012;
        int time2 = 930;
        
        int hour = time / 100;
        int min = time % 100;
        int sec = hour * 3600 + (min * 60);
        
        int hour2 = time2 / 100;
        int min2 = time2 % 100;
        int sec2 = hour2 * 3600 + (min * 60);
        
        int selapsed = sec - sec2;
        int helapsed = sec / 3600;
        double melapsed = sec / 60;
        int selapsedf = sec - melapsed % 10;
        int telapsed = helapsed 
        
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
    }
}

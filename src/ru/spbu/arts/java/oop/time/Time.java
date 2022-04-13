package ru.spbu.arts.java.oop.time;

public class Time {
    private int minutes;
    private int hours;

    public Time(int minutes, int hours){
        this.minutes=minutes;
        this.hours=hours;
    }

    public String show(){
        String clock;
        if (hours<10) {
            clock = "0" + hours+":";
        }else{
            clock= hours +":";
            }
        if (minutes<10){
            clock+="0"+ minutes;
        }else{
            clock+=minutes;
        }
        return clock;
    }

    public boolean isMorning(){
        return (hours<12 && hours>=4);
    }

    public boolean isDay(){
        return (hours>=12 && hours<17);
    }

    public boolean isEvening(){
        return (hours>=17 && hours<21);
    }

    public boolean isNight(){
        return (hours>=22 || hours<4);
    }

    public String sayHello(){
        if(isMorning()){
            return ("Доброе утро!");
        }
        if(isDay()){
            return ("Добрый день");
        }
        if(isEvening()){
            return ("Добрый вечер");
        }
        return ("Доброй ночи");

    }

    public void add(int minutesToAdd){
        minutes+=minutesToAdd;
        hours+=minutes/60;
        minutes=minutes%60;
        hours=hours%24;

    }
}

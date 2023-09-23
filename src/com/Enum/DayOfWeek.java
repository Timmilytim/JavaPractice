package com.Enum;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(2),
    FRIDAY(2),
    SATURDAY(2),
    SUNDAY(2);

    private int dayNumber;

    private DayOfWeek(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return dayNumber;
    }

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;

        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's is a weekday");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend");
                break;
        }
    }
}

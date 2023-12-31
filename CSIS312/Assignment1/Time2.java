// Time2.java--Modify a Class Implementation Assignment - CSIS 312-B01
// CSIS312-B01 (August 28, 2023)
//
//Sources that were used to assist in the development of this code:
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing

public class Time2
{
    private int totalSeconds; //@Change

    // Constructors remain mostly unchanged, but their internals change
    public Time2() { this(0, 0, 0); }
    public Time2(int hour) { this(hour, 0, 0); }
    public Time2(int hour, int minute) { this(hour, minute, 0); }
    public Time2(int hour, int minute, int second)
    {
        setTime(hour, minute, second); //@Change
    }
    public Time2(Time2 time)
    {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods
    public void setTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        totalSeconds = hour * 3600 + minute * 60 + second; //@Change
    }

    public void setHour(int hour)
    {
        setTime(hour, getMinute(), getSecond()); //@Change
    }

    public void setMinute(int minute)
    {
        setTime(getHour(), minute, getSecond()); //@Change
    }

    public void setSecond(int second)
    {
        setTime(getHour(), getMinute(), second); //@Change
    }

    // Get Methods
    public int getHour() { return totalSeconds / 3600; } //@Change
    public int getMinute() { return (totalSeconds % 3600) / 60; } //@Change
    public int getSecond() { return totalSeconds % 60; } //@Change

    // String representation methods remain unchanged
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}

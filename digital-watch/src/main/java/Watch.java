public class Watch
{
    private int hours;
    private int minutes;

    public Watch(int hours, int minutes)
    {
        this.minutes = minutes;
        this.hours = hours;
        if(minutes >= 60)
            MinutesToHours();
        if(this.hours >= 24)
            HoursToDay();
    }
    public void MinutesToHours()
    {
        hours = minutes / 60;
        minutes -= hours * 60;
    }

    public void HoursToDay()
    {
        int days = hours / 24;
        hours -= days * 24;
    }

    public int GetHours()
    {
        return hours;
    }

    public int GetMinutes()
    {
        return minutes;
    }
}
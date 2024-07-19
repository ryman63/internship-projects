public class Odometer
{
    public final int MAX_MILE_AGE = 999999;
    public final int MIN_MILE_AGE = 0;
    private int mileAge;
    private FuelGauge fuelGauge;

    public Odometer(FuelGauge fuelGauge)
    {
        this.fuelGauge = fuelGauge;
        mileAge = 0;
    }

    public int getMileAge()
    {
        return mileAge;
    }

    public void setMileAge(int mileAge)
    {
        if(mileAge >= MIN_MILE_AGE || mileAge <= MAX_MILE_AGE)
            this.mileAge = mileAge;
        if(mileAge > MAX_MILE_AGE)
            resetMileAge();
    }

    public void resetMileAge()
    {
        mileAge = 0;
    }

    public void increaseMileAge()
    {
        setMileAge(mileAge + 1);
        if(mileAge % 10 == 0)
            fuelGauge.decreaseFuel();
    }
}

public class FuelGauge
{
    public final int MAX_FUEL_LEVEL = 50;
    public final int MIN_FUEL_LEVEL = 0;
    private int fuelLevel;

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel)
    {
        if(fuelLevel >= MIN_FUEL_LEVEL || fuelLevel <= MAX_FUEL_LEVEL)
            this.fuelLevel = fuelLevel;
    }

    // заправка топливом 1 л.
    public void increaseFuel()
    {
        setFuelLevel(fuelLevel + 1);
    }

    // расход топлива на 1 л.
    public void decreaseFuel()
    {
        setFuelLevel(fuelLevel - 1);
    }
}

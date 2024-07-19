public class ParkingMeter
{
    private int purchasedMinutes;

    public ParkingMeter(int purchasedMinutes)
    {
        this.purchasedMinutes = purchasedMinutes;
    }

    public int getPurchasedMinutes()
    {
        return purchasedMinutes;
    }
}

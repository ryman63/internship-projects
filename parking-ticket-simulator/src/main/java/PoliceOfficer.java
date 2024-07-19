public class PoliceOfficer
{
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber)
    {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public ParkingTicket inspectCar(ParkedCar car, ParkingMeter meter)
    {
        if (car.getParkedMinutes() > meter.getPurchasedMinutes())
        {
            return new ParkingTicket(car, meter,this);
        }
        return null;
    }

    public String getName()
    {
        return name;
    }

    public  String getBadgeNumber()
    {
        return badgeNumber;
    }
}

public class ParkingTicket
{
    private ParkedCar car;
    private ParkingMeter meter;
    private  PoliceOfficer officer;
    private double fine;

    public ParkingTicket(ParkedCar car, ParkingMeter meter, PoliceOfficer officer)
    {
        this.car = car;
        this.meter = meter;
        this.officer = officer;
        calculateFine();
    }

    private void calculateFine()
    {
        int extraMinutes = car.getParkedMinutes() - meter.getPurchasedMinutes();
        int hours = (extraMinutes + 59) / 60;
        fine = 25 + 10 * hours;
    }

    public double getFine()
    {
        return fine;
    }

    public String getInfo()
    {
        StringBuilder builder = new StringBuilder();

        builder.append(car + "\n");
        builder.append("Продолжительность парковки: " + car.getParkedMinutes() + "\n");
        builder.append("Доступное время для бесплатной парковки: " + meter.getPurchasedMinutes() + "\n");
        builder.append("Сумма штрафа: $" + getFine());

        return  builder.toString();
    }
}

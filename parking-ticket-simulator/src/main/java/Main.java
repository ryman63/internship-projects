public class Main
{
    public static void main(String[] args)
    {
        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 120);
        ParkingMeter meter = new ParkingMeter(90);
        PoliceOfficer officer = new PoliceOfficer("Офицер Васька", "12345");

        ParkingTicket ticket = officer.inspectCar(car, meter);

        if(ticket != null)
        {
            System.out.println("Машина припаркована нелегально");
            System.out.println(ticket.getInfo());
        }
        else
            System.out.println("Машина припаркована легально");

    }
}

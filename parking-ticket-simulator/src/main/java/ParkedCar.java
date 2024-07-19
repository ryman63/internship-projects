public class ParkedCar
{
    private String make;
    private String model;
    private String color;
    private String licensePlate;
    private int parkedMinutes;

    public ParkedCar(String make, String model, String color, String licensePlate, int parkedMinutes)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
        this.parkedMinutes = parkedMinutes;
    }

    @Override
    public String toString() {
        return "Машина : " +
                "марка - '" + make + '\'' +
                ", модель - '" + model + '\'' +
                ", цвет - '" + color + '\'' +
                ", гос. номер - '" + licensePlate + '\'';
    }

    public int getParkedMinutes()
    {
        return parkedMinutes;
    }
}

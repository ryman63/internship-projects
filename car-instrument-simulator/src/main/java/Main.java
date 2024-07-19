public class Main {
    public static void main(String[] args)
    {
        // симулируем автомобиль
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(fuelGauge);

        // Заполняем бак машины на максимум
        for(int i = 0; i < fuelGauge.MAX_FUEL_LEVEL; i++)
        {
            fuelGauge.increaseFuel();
        }

        // Движемся
        while(fuelGauge.getFuelLevel() != fuelGauge.MIN_FUEL_LEVEL)
        {
            odometer.increaseMileAge();
            System.out.println("Топливо: " + fuelGauge.getFuelLevel() + " л. Пробег: " + odometer.getMileAge() + " км.");
        }
    }
}

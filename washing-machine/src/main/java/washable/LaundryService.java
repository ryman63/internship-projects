package washable;

import washable.IWashable;
import washable.Laundry;
import washable.WashingMachine;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LaundryService implements IWashable {

    private WashingMachine[] washingMachines;

    public LaundryService(WashingMachine[] washingMachines) {
        this.washingMachines = washingMachines;
    }

    @Override
    public void wash(List<Laundry> listLaundry) {

        listLaundry.sort(Comparator.comparingInt(Laundry::getScale).reversed());

        for (WashingMachine machine : washingMachines) {
            int laundryIndex = 0;
            do{
                laundryIndex = machine.canAddAnyItems(listLaundry);
                if (laundryIndex >= 0) {
                    machine.addItem(listLaundry.get(laundryIndex));
                    listLaundry.remove(laundryIndex);
                }
            }
            while (laundryIndex >= 0);
        }
    }


    public String getInfo() {
        StringBuilder builder = new StringBuilder();

        for (WashingMachine machine : washingMachines) {
            builder.append("Машинка цвет: " + machine.getColor()
                    + " заполнена на " + machine.getCurrentLoad()
                    + " из " + machine.getCapacity()
                    + "\n");
        }
        return builder.toString();
    }

}
package washable;

import colored.IColored;

import java.util.List;

public class WashingMachine implements IColored {

    private Color color;
    private int capacity;
    private int currentLoad;

    public WashingMachine(Color color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public int canAddAnyItems(List<Laundry> laundryList) {
        for (Laundry item : laundryList)
            if (this.color.equals(item.getColor())
                    && item.getScale() + currentLoad <= capacity) {
                return laundryList.indexOf(item);
            }
        return -1;
    }

    public void addItem(Laundry laundry) {
        currentLoad += laundry.getScale();
    }

    @Override
    public Color getColor() {
        return color;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public int getCapacity() {
        return capacity;
    }
}

package washable;

import colored.IColored;

public class Laundry implements IColored {
    private Color color;
    private int scale;
    @Override
    public Color getColor() {
        return color;
    }
    public int getScale() {
        return scale;
    }
    public Laundry(Color color, int scale) {
        this.color = color;
        this.scale = scale;
    }
}

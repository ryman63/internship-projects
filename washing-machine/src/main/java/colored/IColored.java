package colored;

public interface IColored {
    enum Color {
        White,
        Black,
        Multicolored
    }

    Color getColor();
}

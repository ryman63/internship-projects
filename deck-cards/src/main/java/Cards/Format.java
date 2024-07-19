package Cards;

public enum Format
{
    Full(52), Short(36);
    private int count;
    Format(int count)
    {
        this.count = count;
    }
    public int getCount()
    {
        return count;
    }
}
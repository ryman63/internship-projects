package BankAccount;

import java.util.Objects;

public class Money
{
    // рубли
    int rubles;

    // копейки
    int kopecks;

    public Money()
    {
        this.rubles = 0;
        this.kopecks = 0;
    }
    public Money(int rubles)
    {
        this.rubles = rubles;
        kopecks = 0;
    }

    public Money(int rubles, int kopecks)
    {
        this.rubles = rubles;
        this.kopecks = kopecks;

        kopecksConverting();
    }

    public Money(Money other)
    {
        this.rubles = other.rubles;
        this.kopecks = other.kopecks;
    }

    private void kopecksConverting()
    {
        if(kopecks >= 100)
        {
            rubles += kopecks / 100;
            kopecks %= 100;
        }
    }
    Money Plus(Money right)
    {
        return new Money(right.rubles + this.rubles, right.kopecks + this.kopecks);
    }

    // вычитаем из левого правое
    Money Minus(Money right)
    {
        int rubles = this.rubles - right.rubles;
        int kopecks = this.kopecks - right.kopecks;

        if(kopecks < 0)
        {
            rubles--;
            kopecks += 100;
        }

        if(rubles < 0)
            return null;

        return new Money(rubles, kopecks);
    }

    Money multiply(double factor)
    {
        int sumKopecks = this.rubles * 100 + this.kopecks;
        double result = (double)sumKopecks * factor;
        return new Money(0, (int)result);
    }

    Money divide(int factor)
    {
        int sumKopecks = this.rubles * 100 + this.kopecks;
        double result =sumKopecks / factor;
        return new Money(0, (int)result);
    }

    @Override
    public String toString() {
        return  rubles + " руб. " +
                 + kopecks + " коп.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return rubles == money.rubles && kopecks == money.kopecks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rubles, kopecks);
    }

    public void setToZero()
    {
        this.rubles = 0;
        this.kopecks = 0;
    }

    public void Equate(Money other)
    {
        this.rubles = other.rubles;
        this.kopecks = other.kopecks;
    }

    public int countAllKopecks()
    {
        return (rubles * 100) + kopecks;
    }

    public void setRublesAndKopecks(int rubles, int kopecks)
    {
        this.rubles = rubles;
        this.kopecks = kopecks;

        kopecksConverting();
    }
}

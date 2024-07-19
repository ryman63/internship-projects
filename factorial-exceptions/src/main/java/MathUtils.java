public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException
    {
        if(n < 0)
            throw new IllegalArgumentException("Факториал отрицательного числа не существует");

        if(n > 16)
            throw new IllegalArgumentException("Арифметическое переполнение");

        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;

        return fac;
    }
}

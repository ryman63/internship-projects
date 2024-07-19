import java.util.Arrays;

public class CaesarCipher
{
    static private char[] getRusAlphabet()
    {
        char[] result = new char[32];
        int counter = 0;
        for (char ch = 1072; ch <= 1103; ch++)
        {
            result[counter] = ch;
            counter++;
        }
        return result;
    }
    static private char[] getEngAlphabet()
    {
        char[] result = new char[26];
        int counter = 0;
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            result[counter] = ch;
            counter++;
        }
        return result;
    }
    static public String encode(String text, int shift, int lang)
    {
        text = text.toLowerCase();
        char[] Alphabet;
        switch (lang)
        {
            case 1:
                Alphabet = getRusAlphabet();
                break;
            case 2:
                Alphabet = getEngAlphabet();
                break;
            default:
                Alphabet = getEngAlphabet();
                break;
        }
        StringBuilder result = new StringBuilder();
        for (Character symbol : text.toCharArray())
        {
            int symbolIndex = new String(Alphabet).indexOf(symbol);
            result.append(Character.toString((Alphabet[(symbolIndex + shift) % Alphabet.length])));
        }
        return result.toString();
    }

    static public String decode(String text, int shift, int lang)
    {
        char[] Alphabet;
        switch (lang)
        {
            case 1:
                Alphabet = getRusAlphabet();
                break;
            case 2:
                Alphabet = getEngAlphabet();
                break;
            default:
                Alphabet = getEngAlphabet();
        }
        StringBuilder result = new StringBuilder();
        for (Character symbol : text.toCharArray())
        {
            int symbolIndex = new String(Alphabet).indexOf(symbol);
            result.append(Character.toString((Alphabet[Math.floorMod((symbolIndex - shift), Alphabet.length)])));
        }
        return result.toString();
    }
}

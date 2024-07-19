import java.util.Locale;

public class Main {

    public static void main(String[] args)
    {

        System.out.println("Пример на английском");
        String textEng = "Text, Example?";
        System.out.println("исходный текст: " + textEng);
        String cipherEng = CaesarCipher.encode(textEng, 2, 2);
        System.out.println("Зашифрованный текст: " + cipherEng);
        System.out.println("Расшифрованный: " + CaesarCipher.decode(cipherEng, 2, 2));
        System.out.println("");

        System.out.println("Пример на русском");
        String textRus = "Пример, Текста?";
        System.out.println("исходный текст: " + textRus);
        String cipherRus = CaesarCipher.encode(textRus, 2, 1);
        System.out.println("Зашифрованный текст: " + cipherRus);
        System.out.println("Расшифрованный: " + CaesarCipher.decode(cipherRus, 2, 1));
    }
}